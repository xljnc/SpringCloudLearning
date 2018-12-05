package com.wt.spring.consumer.withfeign.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wt.spring.consumer.withfeign.bean.ConsumerFeignClient;
import com.wt.spring.provider.dto.request.InstanceInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        return client.getProviderInfos();
    }

    @PostMapping("/instance/{id}/info")
    public String getInstanceInfo(@PathVariable(value = "id") Integer id) {
        return client.getInstanceInfo(id);
    }

    @PostMapping("/instance/param/test")
    public String testInstanceInfo(@RequestBody InstanceInfoDto params) {
        return client.testInstanceInfo(params);
    }

    @HystrixCommand(fallbackMethod = "defaultFallback")
    @GetMapping("/fallback/test")
    public String testFallback() {
        return client.testFallback();
    }

    @GetMapping("/feign/fallback")
    public String testFeignFallback() {
        return client.testFeignFallback();
    }


    public String defaultFallback() {
        return "Method call failed,using ConsumerFeignController fallback.";
    }

}
