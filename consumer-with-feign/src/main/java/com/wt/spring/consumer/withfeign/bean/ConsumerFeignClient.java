package com.wt.spring.consumer.withfeign.bean;

import com.wt.spring.consumer.withfeign.fallback.DefaultFallback;
import com.wt.spring.provider.dto.request.InstanceInfoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Xljnc
 * @date 2018/11/10 22:08
 * @description
 */
@FeignClient(name = "provider",fallback = DefaultFallback.class)
public interface ConsumerFeignClient {
    @GetMapping("/provider/info/get")
    String getProviderInfos();

    @PostMapping("/provider/instance/{id}/info")
    String getInstanceInfo(@PathVariable(value = "id") Integer id);

    @PostMapping("/provider/instance/param/test")
    String testInstanceInfo(@RequestBody InstanceInfoDto params);

    @GetMapping("/provider/fallback/test")
    String testFallback();

    @GetMapping("/provider/fallback/test")
    String testFeignFallback();
}
