package com.itudy.userservice.entity;


import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "USER_TB")
public class UserVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx", unique = true, nullable = false)
    Long idx;

    @Column(name = "email", nullable = false, unique = true, length = 50)
    String email;

    @Column(name = "nickname", nullable = false, unique = false, length = 50)
    String nickname;

    @Column(name = "oauth", nullable = false, unique = false, length = 50)
    String oauth;

    @Column(name = "activated", nullable = false, unique = false)
    boolean activated;

    @Column(name = "refresh_token", nullable = true, unique = true)
    String refreshToken;

    @Column(name = "fcm_token", nullable = true, unique = true)
    String fcmToken;

    @Column(name = "profile_image", nullable = true, unique = false)
    String profileImage;

    @CreationTimestamp
    @Column(name = "created_at")
    LocalDateTime createdAt;



}
