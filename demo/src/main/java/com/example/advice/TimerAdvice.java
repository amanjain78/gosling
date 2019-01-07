package com.example.advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Aspect
@Service
@Slf4j
public class TimerAdvice {

    @Pointcut("@annotation(com.example.annotations.Timer)")
    public void timerPointCut(){

    }

    @Around("timerPointCut()")
    public void timerAdvice(ProceedingJoinPoint proceedingJoinPoint){
        Signature signature = proceedingJoinPoint.getSignature();
        String methodName = signature.getName();
        StopWatch watch = new StopWatch();
        watch.start();
        try {
            proceedingJoinPoint.proceed();
        }catch (Throwable e){
            log.error("Error Occurred {}",e);
        }
        watch.stop();
        log.info("Time taken for method {} to execute is {}",methodName,watch.getTotalTimeMillis());
    }
}
