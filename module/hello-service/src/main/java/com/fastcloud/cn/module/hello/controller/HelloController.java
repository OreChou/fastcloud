package com.fastcloud.cn.module.hello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author OreChou
 * @create 2018-06-10 5:09 PM
 */
@RestController
@RequestMapping(value = {"/hello"})
public class HelloController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/foo")
    public String foo() {
        return foo;
    }

}
