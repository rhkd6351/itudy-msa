package com.itudy.userservice.persistence.entity;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "USER_TB")
@NoArgsConstructor
public class UserVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx", unique = true, nullable = false)
    Long idx;

    @Column(name = "email", nullable = false, unique = true, length = 45)
    String email;

    @Column(name = "password", nullable = false)
    String password;

    @Column(name = "nickname", nullable = false, length = 45)
    String nickname;

    @Column(name = "oauth", nullable = false, length = 45)
    String oauth;

    @Column(name = "activated", nullable = false)
    boolean activated;

    @Column(name = "refresh_token", unique = true)
    String refreshToken;

    @Column(name = "fcm_token", unique = true)
    String fcmToken;

    @Column(name = "profile_image")
    String profileImage;

    @CreationTimestamp
    @Column(name = "created_at")
    LocalDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "auth_fk")
    AuthVO auth;

    @Builder
    public UserVO(String email, String nickname, String oauth, boolean activated, String profileImage, AuthVO auth, String password) {
        this.email = email;
        this.nickname = nickname;
        this.oauth = oauth;
        this.activated = activated;
        this.profileImage = profileImage;
        this.auth = auth;
        this.password = password;
    }

    public enum OAuth{

        OAUTH_DEFAULT("email"),
        OAUTH_KAKAO("kakao"),
        OAUTH_GOOGLE("google"),
        OAUTH_FACEBOOK("facebook");

        final String name;

        OAuth(String name) {
            this.name = name;
        }
    }
}
