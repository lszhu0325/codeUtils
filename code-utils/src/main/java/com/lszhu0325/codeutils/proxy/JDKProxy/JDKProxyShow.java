package com.lszhu0325.codeutils.proxy.JDKProxy;

import com.lszhu0325.codeutils.proxy.JDKProxy.JDKProxy;

import java.lang.reflect.Proxy;

/**
 * Create by lenovo on 2020/4/7
 */
public class JDKProxyShow {
    public static void main(String[] args) {
        AnimalBehavior animalBehavior = (AnimalBehavior) Proxy.newProxyInstance(Cat.class.getClassLoader(), Cat.class.getInterfaces(), new JDKProxy(new Cat()));
        animalBehavior.walk();
    }
}
