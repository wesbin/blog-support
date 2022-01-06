package com.emptycastle.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class ExecutionTimeAOP {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

//    @Around("execution(* *..controller.*.*(..))")
    public Object calculateExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object result = joinPoint.proceed();

        stopWatch.stop();
        long totalTimeMillis = stopWatch.getTotalTimeMillis();

        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        String task = className + "." + methodName;

        logger.info("[Execution Time]" + task + "==>" + totalTimeMillis + "(ms)");

        return result;
    }
}
