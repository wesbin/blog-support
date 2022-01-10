package com.emptycastle.aop.invocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PeopleHandler implements InvocationHandler {

    private final People original = new PeopleImpl();

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        method.invoke(original, args);
        after(method);

        return null;
    }

    private void before() {
        System.out.println(">>>> active");
        original.nowState();
    }

    private void after(Method method) {
        MethodName target = MethodName.valueOf(method.getName().toUpperCase());

        if (target.isEquals(MethodName.TALKING, MethodName.STUDYING)) {
            System.out.println(">>> use stamina");
        } else if(target.isEquals(MethodName.EATING)) {
            System.out.println(">>> get stamina");
        }

        original.nowState();
        System.out.println(">>> end active");
        System.out.println();
    }
}
