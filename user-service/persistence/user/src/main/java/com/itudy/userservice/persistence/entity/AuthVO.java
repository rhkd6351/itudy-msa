package com.itudy.userservice.persistence.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "AUTH_TB")
public class AuthVO {

    @Id
    @Column(name = "name", unique = true, nullable = false)
    String name;

    @Getter
    public enum Type{
        ROLE_ADMIN("ROLE_ADMIN"),
        ROLE_USER("ROLE_USER");

        final String value;

        Type(String value) {
            this.value = value;
        }
    }

}
