package com.cnc.gdp.servicefeign.controller;

import com.cnc.gdp.servicefeign.service.serviceImpl.ServiceHelloImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    ServiceHelloImpl serviceHello;

    @GetMapping("/hi")
    public String sayHello(@RequestParam String name) {
        return serviceHello.sayHello(name);
    }

}
