package com.zyh.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----------------服务器发生宕机，请后续进行尝试-----------------paymentInfo_OK，/(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "-----------------服务器发生宕机，请后续进行尝试-----------------paymentInfo_Timeout，/(ㄒoㄒ)/~~";
    }
}
