package com.lszhu0325.codeutils.proxy.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Create by lenovo on 2020/4/7
 */
public class JDKProxy implements InvocationHandler {
    private Object object;
    public JDKProxy(Object object) {
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("被代理对象执行之前执行逻辑...");
        Object result = method.invoke(object, args);
        System.out.println("被代理对象执行之后执行逻辑...");
        return result;
    }
}
