package com.itudy.userservice.api.controller;

import com.itudy.userservice.persistence.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;


    @GetMapping(path = "/test")
    public ResponseEntity<String> test(){
        return new ResponseEntity<>("hello world!" + testService.testService(), HttpStatus.OK);
    }


}
