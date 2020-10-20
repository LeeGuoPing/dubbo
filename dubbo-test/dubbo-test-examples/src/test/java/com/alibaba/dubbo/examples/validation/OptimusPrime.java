package com.alibaba.dubbo.examples.validation;

/**
 * SPI 测试
 *
 * @author liguoping
 * @since 2020/10/20 11:57
 */
public class OptimusPrime implements Robot {

    @Override
    public void sayHello() {
        System.out.println("Hello, I am Optimus Prime.");
    }
}
