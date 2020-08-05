package com.suckmydisk.servicefeign.controller;


import com.suckmydisk.servicefeign.service.SchedualServiceHello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    SchedualServiceHello schedualServiceHello;

    @GetMapping("/hello")
    public String sayHello(@RequestParam String name) {
        return schedualServiceHello.sayHello(name);
    }

}
