package com.zb.sp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//服务提供者，只需要返回数据，所以都返回的是JSON格式,属于客户端类型（client）
@SpringBootApplication
@EnableEurekaClient
@MapperScan(value = "com.zb.sp.dao")
public class SpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpApplication.class, args);
    }

}
