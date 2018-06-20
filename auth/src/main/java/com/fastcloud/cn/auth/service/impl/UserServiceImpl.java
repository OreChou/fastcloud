package com.fastcloud.cn.auth.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.fastcloud.cn.auth.service.UserService;
import com.fastcloud.cn.support.dao.system.UserMapper;
import com.fastcloud.cn.support.domain.system.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @author OreChou
 * @create 2018-06-14 11:07 AM
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        EntityWrapper<User> wrapper = new EntityWrapper<>();
        wrapper.eq("username", username);
        User user = userMapper.selectList(wrapper).get(0);
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthority());
    }

    private List getAuthority() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
    }

}
