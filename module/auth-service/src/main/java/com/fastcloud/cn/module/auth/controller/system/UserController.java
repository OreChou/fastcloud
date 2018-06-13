package com.fastcloud.cn.module.auth.controller.system;

import com.baomidou.mybatisplus.plugins.Page;
import com.fastcloud.cn.support.domain.norm.Response;
import com.fastcloud.cn.support.domain.system.User;
import com.fastcloud.cn.support.service.system.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 *
 * @author OreChou
 * @create 2018-06-12 4:51 PM
 */
@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("list")
    public Response list(@RequestBody Page<User> page) {
        page = userService.selectPage(page);
        return Response.ok(page);
    }

    @PostMapping("add")
    public Response add(@RequestBody User user) {
        return Response.ok(userService.insert(user));
    }

}
