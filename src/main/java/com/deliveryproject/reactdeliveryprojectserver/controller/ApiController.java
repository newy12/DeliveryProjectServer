package com.deliveryproject.reactdeliveryprojectserver.controller;

import com.deliveryproject.reactdeliveryprojectserver.entity.Member;
import com.deliveryproject.reactdeliveryprojectserver.service.SignupService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@RestController
@Slf4j
public class ApiController {

    private final SignupService signupService;

    @PostMapping("/signup")
    public Member signup(@RequestBody(required = false) Map<String, String> paramsMap) {
        //화면에서 값이 제대로 넘어왔을때 처리
        if(paramsMap != null){
            return signupService.saveMemberInfo(paramsMap);
        }
        //화면에서 값이 안넘어왔을때 처리
        else{
            log.info("값 안넘어옴");
            return null;
        }




    }
}

