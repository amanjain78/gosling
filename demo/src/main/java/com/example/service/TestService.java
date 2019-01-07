package com.example.service;
import com.example.annotations.Timer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestService {

    /*This annotation is used to process a task in async method
    * Different parameters can be provided for this annotation.
    *
    * */
    @Async
    @Timer
    public void test(){
        log.info("M2"+Thread.currentThread().getName());
    }




}
