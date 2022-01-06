package com.emptycastle.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SummaryLogAOP {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("@annotation(com.emptycastle.aop.aspect.SummaryLogAnnotation)")
    public Object summaryLog(ProceedingJoinPoint joinPoint) throws Throwable {

        logger.info("======================== summaryLog ========================");

        Object result = joinPoint.proceed();

        logger.info("======================== summaryLog ========================");

        return result;
    }
}
