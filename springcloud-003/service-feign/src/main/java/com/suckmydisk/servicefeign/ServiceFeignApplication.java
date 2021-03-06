package com.suckmydisk.servicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 注解 @EnableFeignClients 开启Feign功能
 *
 * 注解 @EnableDiscoveryClient 与  @EnableEurekaClient 相比
 * 前者可以让其他注册中心发现，后者只能给 Eureka 发现
 */

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
//springcloud004,feign 自带断路器，需要在配置文件显式打开hystrix
@EnableHystrix
public class ServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class, args);
    }

}
