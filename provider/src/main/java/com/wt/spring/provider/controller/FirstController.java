package com.wt.spring.provider.controller;

import com.wt.spring.provider.dto.request.InstanceInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author WuTian
 * @date 2018-11-09 13:05
 * @description
 */

@RestController
@RequestMapping("/provider")
public class FirstController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private Registration registration;


    @GetMapping("/serviceinstances/get")
    public List<ServiceInstance> showServiceInstances() {
        return discoveryClient.getInstances("provider");
    }

    @GetMapping("/info/get")
    public String getProviderInfos() {
        return "Host:" + registration.getHost() + ",port:" + registration.getPort();
    }

    @PostMapping("/instance/{id}/info")
    public String getInstanceInfo(@PathVariable Integer id) {
        return "ID:" + id + ",Host:" + registration.getHost() + ",port:" + registration.getPort();
    }

    @PostMapping("/instance/param/test")
    public String testInstanceInfo(@RequestBody InstanceInfoDto params) {
        return params.toString() + ",Host:" + registration.getHost() + ",port:" + registration.getPort();
    }
}
