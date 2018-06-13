package com.fastcloud.cn.support.service.system.impl;

import com.fastcloud.cn.support.domain.system.Role;
import com.fastcloud.cn.support.dao.system.RoleMapper;
import com.fastcloud.cn.support.service.system.IRoleService;
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
public class RoleService extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
