package com.zyh.springcloud;

import com.zyh.rule.mySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "cloud-payment-service",configuration = mySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
//CLOUD-PAYMENT-SERVICE
//cloud-payment-service
//此处遇到坑，为什么非要大写才会生效，而和yml文件中的名字一致并不生效。
//因为RibbonClient中的name属性需要与OderController中调用的url保持一致
