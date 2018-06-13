package com.fastcloud.cn.module.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * 认证服务
 *
 * @author OreChou
 * @create 2018-06-12 4:48 PM
 */
@EnableEurekaClient
@SpringBootApplication
@ComponentScan(basePackages={"com.fastcloud.cn"})
public class AuthServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthServiceApplication.class, args);
    }

}
