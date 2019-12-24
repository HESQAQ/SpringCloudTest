package com.cnc.gdp.servicefeign.service.serviceImpl;

import com.cnc.gdp.servicefeign.service.ServiceHelloHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi", fallback = ServiceHelloHystric.class)
public interface ServiceHelloImpl {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHello(@RequestParam(value = "name", defaultValue = "hesq")String name);
}
