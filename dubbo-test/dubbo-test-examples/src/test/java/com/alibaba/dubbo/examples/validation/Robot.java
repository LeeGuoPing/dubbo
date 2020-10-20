package com.alibaba.dubbo.examples.validation;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * SPI 测试
 *
 * @author liguoping
 * @since 2020/10/20 11:56
 */
@SPI("optimusPrime")
public interface Robot {

    void sayHello();

}
