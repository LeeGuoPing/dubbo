package com.alibaba.dubbo.examples.validation;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

import java.util.regex.Pattern;

/**
 * SPI 测试
 *
 * @author liguoping
 * @since 2020/10/20 14:52
 */
public class DubboSPITest {

    private static final Pattern NAME_SEPARATOR = Pattern.compile("\\s*[,]+\\s*");

    @Test
    public void sayHello(){
        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
        // 获取默认的接口扩展
        Robot optimusPrime = extensionLoader.getExtension("true");
        optimusPrime.sayHello();

        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();


        String[] split = NAME_SEPARATOR.split("abc, ddd");
        if(split != null){
            for (String s : split) {
                System.out.println(s);
            }
        }


    }
}
