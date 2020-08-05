package com.suckmydisk.eurekaclient001_2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class EurekaClient0012Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient0012Application.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("hello")
    public String hello(@RequestParam String name) {
        return "hi," + name + "," + port;
    }


}
