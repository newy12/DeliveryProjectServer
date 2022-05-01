package com.deliveryproject.reactdeliveryprojectserver.service;

import com.deliveryproject.reactdeliveryprojectserver.entity.Member;
import com.deliveryproject.reactdeliveryprojectserver.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
public class SignupService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public Member saveMemberInfo(Map<String, String> paramsMap) {

        Member member = Member.builder()
                .userId(paramsMap.get("userId"))
                .username(paramsMap.get("username"))
                .password(passwordEncoder.encode(paramsMap.get("password")))
                .phoneNumber(paramsMap.get("phoneNumber"))
                .build();
        log.info("userId : {}",member.getUserId());
        log.info("username : {}",member.getUsername());
        log.info("password 암호화: {}",member.getPassword());
        log.info("phoneNumber : {}",member.getPhoneNumber());
        return memberRepository.save(member);


    }
}
