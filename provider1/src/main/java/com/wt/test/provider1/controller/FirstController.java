package com.wt.test.provider1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author WuTian
 * @date 2018-11-09 13:05
 * @description
 */

@RestController
@RequestMapping("/provider1")
public class FirstController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/serviceinstances/get")
    public List<ServiceInstance> showServiceInstances() {
        return discoveryClient.getInstances("provider1");
    }
}
