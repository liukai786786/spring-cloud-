package com.example.serviceribbon.web;

import com.example.serviceribbon.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping(value="/hi")
    public String hi(@RequestParam String name){
       return helloService.sayHi(name);
    }
}
