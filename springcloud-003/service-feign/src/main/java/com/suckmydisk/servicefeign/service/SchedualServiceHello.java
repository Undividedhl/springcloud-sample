package com.suckmydisk.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("client-001")
public interface SchedualServiceHello {

    /**
     * 实际调用的是 client-001 接口
     * @param name
     * @return
     */
    @GetMapping("/hello")
    String sayHello(@RequestParam("name") String name);
}
