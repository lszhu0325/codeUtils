package com.lszhu0325.codeutils.proxy.JDKProxy;

/**
 * Create by lenovo on 2020/4/7
 */
public class Cat implements AnimalBehavior {
    @Override
    public void walk() {
        System.out.println("我是猫, 我喜欢跳着走...");
    }
}
