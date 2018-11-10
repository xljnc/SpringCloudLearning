package com.wt.spring.consumer.withfeign.bean;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Xljnc
 * @date 2018/11/10 22:08
 * @description
 */
@FeignClient("provider")
public interface ConsumerFeignClient {
    @GetMapping("/provider/info/get")
     String getProviderInfo();
}
