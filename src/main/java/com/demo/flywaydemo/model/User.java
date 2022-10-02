package com.demo.flywaydemo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="USERS")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private Long age;

}
