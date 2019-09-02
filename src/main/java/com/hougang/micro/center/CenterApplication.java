package com.hougang.micro.center;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


/** 
* @Description: 启动类 
* @version: v1.0
* @author: hougang_ahut@163.com
* @date: 2019年9月2日 下午10:59:22
*/ 
@EnableSwagger2
@EnableFeignClients
@EnableDiscoveryClient
@EnableApolloConfig
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.hougang.micro.center.mapper")
public class CenterApplication {
	public static void main(String[] args) {
		SpringApplication.run(CenterApplication.class, args);
	}
}
