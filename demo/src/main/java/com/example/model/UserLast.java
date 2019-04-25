package com.example.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "user_last")
@Data
@Setter
@Getter
public class UserLast {

    @Id
    private long id;

    private String name;

}
