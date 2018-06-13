package com.fastcloud.cn.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心服务
 *
 * @author OreChou
 * @create 2018-06-10 4:25 PM
 */
@SpringBootApplication
@EnableEurekaServer
public class CenterServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CenterServerApplication.class, args);
    }

}
