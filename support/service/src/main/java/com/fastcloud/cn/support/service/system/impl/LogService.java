package com.fastcloud.cn.support.service.system.impl;

import com.fastcloud.cn.support.domain.system.Log;
import com.fastcloud.cn.support.dao.system.LogMapper;
import com.fastcloud.cn.support.service.system.ILogService;
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
public class LogService extends ServiceImpl<LogMapper, Log> implements ILogService {

}
