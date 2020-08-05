package com.suckmydisk.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * springcloud 004
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHello {

    @Override
    public String sayHello(String name) {
        return "sorry" + name;
    }
}
