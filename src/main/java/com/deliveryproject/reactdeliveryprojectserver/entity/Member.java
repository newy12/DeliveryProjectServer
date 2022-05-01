package com.deliveryproject.reactdeliveryprojectserver.entity;

import lombok.*;
import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
@Getter
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    //기본키
    private Long id;

    //유저아이디
    private String userId;

    //이름
    private String username;

    //비밀번호
    private String password;

    //휴대폰 번호
    private String phoneNumber;


    @Builder
    public Member(String username,String userId, String password, String phoneNumber) {
        this.username = username;
        this.userId = userId;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

}
