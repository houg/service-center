package com.hougang.micro.center.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: jungle
 * @Date: 2019/4/5 10:47 PM
 */
@Configuration
public class SnowFlakeConfig {

    @Value("${snowflake.workerId}")
    private long workerId;
    @Value("${snowflake.datacenterId}")
    private long datacenterId;



    @Bean
    public SnowflakeIdWorker snowflakeIdWorker(){
        return new SnowflakeIdWorker(workerId, datacenterId);
    }
}
