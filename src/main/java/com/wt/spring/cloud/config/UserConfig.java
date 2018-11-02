package com.wt.spring.cloud.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author WuTian
 * @date 2018-11-01 16:57
 * @description
 */
@Component
@ConfigurationProperties("userconfig")
@Data
public class UserConfig {
    private String name;
    private Integer age;
    private Address address;
}
