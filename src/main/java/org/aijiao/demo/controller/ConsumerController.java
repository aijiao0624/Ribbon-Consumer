package org.aijiao.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/ribbon-consumer")
    public String helloConsumer() {
        return restTemplate.getForObject("http://HELLO-SERVICE/hello", String.class);
    }

}
