package com.fastcloud.cn.support.service.system.impl;

import com.fastcloud.cn.support.domain.system.Token;
import com.fastcloud.cn.support.dao.system.TokenMapper;
import com.fastcloud.cn.support.service.system.ITokenService;
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
public class TokenService extends ServiceImpl<TokenMapper, Token> implements ITokenService {

}
