package com.lszhu0325.codeutils.proxy.CGLIBProxy;

import net.sf.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.Callback;

/**
 * Create by lenovo on 2020/4/7
 */
public class CGLIBProxyShow {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Cat.class);
        enhancer.setCallback(new CGLIBProxyInterceptor());
        Cat proxyCat = (Cat) enhancer.create();
        proxyCat.walk();
    }
}
