package com.emptycastle.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(1)
@Component
public class CommonLogAOP {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("@annotation(CommonLogAnnotation)")
    public Object summaryLog(ProceedingJoinPoint joinPoint) throws Throwable {

        logger.info("===== summaryLog start=====");

        Object result = joinPoint.proceed();

        logger.info("===== summaryLog end=====");
        return result;
    }
}
