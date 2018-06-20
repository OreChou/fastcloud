package com.fastcloud.cn.auth.controller;

import com.fastcloud.cn.auth.service.UserService;
import com.fastcloud.cn.support.domain.system.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.List;

/**
 * @author OreChou
 * @create 2018-06-14 11:28 AM
 */
@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User create(@RequestBody User user){
        return user;
    }

//    @GetMapping("/userJwt")
//    public Object getCurrentUserJwt(Authentication authentication, HttpServletRequest request) throws UnsupportedEncodingException {
//        log.info("【SecurityOauth2Application】 getCurrentUserJwt authentication={}", JsonUtil.toJson(authentication));
//
//        String header = request.getHeader("Authorization");
//        String token = StringUtils.substringAfter(header, "bearer ");
//
//        Claims claims = Jwts.parser().setSigningKey(oAuth2Properties.getJwtSigningKey().getBytes("UTF-8")).parseClaimsJws(token).getBody();
//        String blog = (String) claims.get("blog");
//        log.info("【SecurityOauth2Application】 getCurrentUser1 blog={}", blog);
//
//        return authentication;
//    }

//    @GetMapping("/userRedis")
//    public Object getCurrentUserRedis(Authentication authentication) {
//        log.info("【SecurityOauth2Application】 getCurrentUserRedis authentication={}", JsonUtil.toJson(authentication));
//
//
//        return authentication;
//    }

    @GetMapping("/user/me")
    public Principal user(Principal user){
        return user;
    }

}
