package com.cnc.gdp.serviceribbon.service;

import com.cnc.gdp.serviceribbon.service.Impl.HelloServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService implements HelloServiceImpl {
    @Autowired
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+ name, String.class);
    }

    public String hiError(String name) {
        return "Hello " + name + ", Sorry! Error!";
    }
}
