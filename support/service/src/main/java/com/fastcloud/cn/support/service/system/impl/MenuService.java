package com.fastcloud.cn.support.service.system.impl;

import com.fastcloud.cn.support.domain.system.Menu;
import com.fastcloud.cn.support.dao.system.MenuMapper;
import com.fastcloud.cn.support.service.system.IMenuService;
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
public class MenuService extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
