package com.cnc.gdp.servicefeign.service;

import com.cnc.gdp.servicefeign.service.serviceImpl.ServiceHelloImpl;
import org.springframework.stereotype.Component;

@Component
public class ServiceHelloHystric implements ServiceHelloImpl {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + ", Sorry! Error!";
    }
}
