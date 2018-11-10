package com.wt.spring.consumer.withfeign.controller;

import com.wt.spring.consumer.withfeign.bean.ConsumerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xljnc
 * @date 2018/11/10 22:12
 * @description
 */
@RestController
@RequestMapping("/feignconsumer")
public class ConsumerFeignController {
    @Autowired
    private ConsumerFeignClient client;

    @GetMapping("/provider/info/get")
    public String getProviderInfo() {
        return client.getProviderInfo();
    }
}
