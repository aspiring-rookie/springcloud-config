package com.zyh.springcloud.service;

import com.zyh.springcloud.entities.CommonResult;
import com.zyh.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")  //哪个微服务
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")   //8001对外暴露访问的地址
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
//service 写了有哪些方法，且会调用的微服务名称，通过controller调用service的接口来实现