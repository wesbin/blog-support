package com.emptycastle.aop;

import com.emptycastle.aop.controller.TestController;
import com.emptycastle.aop.invocationHandler.People;
import com.emptycastle.aop.invocationHandler.PeopleCglibHandler;
import com.emptycastle.aop.invocationHandler.PeopleHandler;
import com.emptycastle.aop.invocationHandler.PeopleImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.lang.reflect.Proxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class AopApplication {

    public static void main(String[] args) {
        People people = (People) Proxy.newProxyInstance(People.class.getClassLoader(), new Class[]{People.class}, new PeopleHandler());
        people.talking("hello world~");
        people.eating("chicken");
        people.studying("math");
        people.nowState();

        PeopleImpl peopleImpl = (PeopleImpl) Enhancer.create(PeopleImpl.class, new PeopleCglibHandler());
        peopleImpl.talking("bye world~");
        peopleImpl.eating("pizza");
        peopleImpl.studying("coding");
        peopleImpl.nowState();
//        SpringApplication.run(AopApplication.class, args);
    }
}
