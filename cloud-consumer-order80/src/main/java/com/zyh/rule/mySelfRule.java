package com.zyh.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();  //定义随机规则
    }
}
