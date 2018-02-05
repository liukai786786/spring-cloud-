package com.example.serviceribbon.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class HelloService {

    @Resource
    private RestTemplate restTemplate;

    public String sayHi(String name){
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);

    }
}
