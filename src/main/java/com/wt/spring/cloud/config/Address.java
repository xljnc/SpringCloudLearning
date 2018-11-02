package com.wt.spring.cloud.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author WuTian
 * @date 2018-11-01 17:04
 * @description
 */
@Component
@Data
@ConfigurationProperties("address")
public class Address {
    private String province;
    private String city;
}
