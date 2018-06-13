package com.fastcloud.cn.support.service.system.impl;

import com.fastcloud.cn.support.domain.system.Permission;
import com.fastcloud.cn.support.dao.system.PermissionMapper;
import com.fastcloud.cn.support.service.system.IPermissionService;
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
public class PermissionService extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

}
