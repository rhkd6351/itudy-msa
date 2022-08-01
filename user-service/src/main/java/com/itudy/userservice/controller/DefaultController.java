package com.itudy.userservice.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class DefaultController {


    @GetMapping("/user-service/welcome")
    public ResponseEntity<String> welcome(){
        return new ResponseEntity<>("hello world!", HttpStatus.OK);
    }


}
