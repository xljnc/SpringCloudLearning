package com.wt.spring.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author WuTian
 * @date 2018-11-09 16:05
 * @description
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/provider/info/get")
    public String getProviderInfo() {
        return restTemplate.getForObject("http://provider/provider/info/get", String.class);
    }
}
