package com.lszhu0325.codeutils.proxy.CGLIBProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Create by lenovo on 2020/4/7
 */
public class CGLIBProxyInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("被代理对象执行前执行逻辑...");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("被代理对象执行后执行逻辑...");
        return result;
    }
}
