package com.emptycastle.aop.invocationHandler;

import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

public class PeopleCglibHandler implements InvocationHandler {

    private final PeopleImpl original = new PeopleImpl();

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
        } else if (target.isEquals(MethodName.EATING)) {
            System.out.println(">>> get stamina");
        }

        original.nowState();
        System.out.println(">>> end active");
        original.readCount();
        System.out.println();

    }
}
