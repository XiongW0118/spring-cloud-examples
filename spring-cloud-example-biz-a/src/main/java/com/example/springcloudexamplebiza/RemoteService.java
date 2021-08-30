package com.example.springcloudexamplebiza;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "spring-cloud-example-biz-b") //指定服务名称
public interface RemoteService {

    /**
     * 调用服务B的hello方法
     *
     * @return
     */
    @GetMapping("/hello") //指定请求地址
    String sayHello();
}
