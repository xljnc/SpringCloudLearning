package com.wt.spring.cloud.Controller;

import com.wt.spring.cloud.config.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WuTian
 * @date 2018-11-01 16:07
 * @description
 */
@RestController
@RequestMapping("/")
public class HomeController {


    @Value("${server.port}")
    private Integer port;

    @Autowired
    private UserConfig userConfig;

    @PostMapping("/index")
    public String index() {
        return "Hello World";
    }

    @PostMapping("/port/get")
    public String getPort() {
        return String.valueOf(this.port);
    }

    @PostMapping("/userconfig/get")
    public UserConfig getUserConfig() {
        return this.userConfig;
    }
}
