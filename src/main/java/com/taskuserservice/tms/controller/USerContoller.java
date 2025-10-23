package com.taskuserservice.tms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class USerContoller {

    public ResponseEntity<String> createtask(){
        return new ResponseEntity("firstclas", HttpStatus.CREATED);
    }

}
