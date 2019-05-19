package com.smile.springboot.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Async
    public String testAsync(){
        return "in service .";
    }
}
