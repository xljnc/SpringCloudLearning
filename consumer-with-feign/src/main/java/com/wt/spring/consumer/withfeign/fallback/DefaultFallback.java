package com.wt.spring.consumer.withfeign.fallback;

import com.wt.spring.consumer.withfeign.bean.ConsumerFeignClient;
import com.wt.spring.provider.dto.request.InstanceInfoDto;
import org.springframework.stereotype.Component;

/**
 * @author WuTian
 * @date 2018-11-12 11:48
 * @description
 */
@Component
public class DefaultFallback implements ConsumerFeignClient {

    @Override
    public String testFeignFallback() {
        return "Method call failed,using default Feign fallback.";
    }

    @Override
    public String getProviderInfos() {
        return null;
    }

    @Override
    public String getInstanceInfo(Integer id) {
        return null;
    }

    @Override
    public String testInstanceInfo(InstanceInfoDto params) {
        return null;
    }

    @Override
    public String testFallback() {
        return null;
    }


}
