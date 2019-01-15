package com.example.repository.master;

import com.example.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserMasterRepository extends CrudRepository<User,Long> {

}
