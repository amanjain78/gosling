package com.example.repository.master;

import com.example.model.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface UserMasterRepository extends CrudRepository<User,Long> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE user set name = 'def' where id = 1")
    public void test1();





}
