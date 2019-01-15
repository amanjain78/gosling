package com.example.service;
import com.example.annotations.Timer;
import com.example.model.User;
import com.example.repository.master.UserMasterRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class TestService {

    @Autowired
    private UserMasterRepository userMasterRepository;

    /*This annotation is used to process a task in async method
    * Different parameters can be provided for this annotation.
    *
    * */
    @Async
    @Timer
    public void test(){
        log.info("M2"+Thread.currentThread().getName());
    }

    @Transactional()
    public void saveUser(User user){
        userMasterRepository.save(user);
    }




}
