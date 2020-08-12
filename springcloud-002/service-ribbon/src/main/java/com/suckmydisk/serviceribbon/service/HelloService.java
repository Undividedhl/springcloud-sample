package com.suckmydisk.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 10199
 */
@Service
public class HelloService {
    @Resource
    RestTemplate restTemplate;

    /**
     * 调用名为 CLIENT-001 的服务，由于注册了两个名为 CLIENT-001的服务，且开启了负载均衡
     * 访问会来回落在两个服务中的一个上
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://client-001/hello?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "hi," + name + ", sorry, error!!!";
    }
}
