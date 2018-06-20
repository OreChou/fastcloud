package com.fastcloud.cn.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 鉴权服务
 *
 * @author OreChou
 * @create 2018-06-13 9:09 PM
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.fastcloud.cn"})
public class AuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthServerApplication.class, args);
    }

}
