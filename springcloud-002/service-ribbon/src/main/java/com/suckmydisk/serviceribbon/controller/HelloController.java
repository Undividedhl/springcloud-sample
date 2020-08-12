package com.suckmydisk.serviceribbon.controller;

import com.suckmydisk.serviceribbon.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    HelloService helloService;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
