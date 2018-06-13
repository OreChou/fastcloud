package com.fastcloud.cn.support.service.system.impl;

import com.fastcloud.cn.support.domain.system.User;
import com.fastcloud.cn.support.dao.system.UserMapper;
import com.fastcloud.cn.support.service.system.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author OreChou
 * @since 2018-06-13
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> implements IUserService {

}
