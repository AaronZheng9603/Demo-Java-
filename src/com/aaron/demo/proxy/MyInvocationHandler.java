package com.aaron.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Object mTarget;

    public MyInvocationHandler(Object target) {
        mTarget = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Student should also eat.");
        return method.invoke(mTarget, args);
    }
}
