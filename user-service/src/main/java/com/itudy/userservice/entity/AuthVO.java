package com.itudy.userservice.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "AUTH_TB")
public class AuthVO {

    @Id
    @Column(name = "name", unique = true, nullable = false)
    String name;

}
