package com.fastcloud.cn.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

/**
 * 访问控制
 *
 * @author OreChou
 * @create 2018-06-13 12:10 PM
 */
public class AccessFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return null;
    }

    // filter执行顺序，通过数字指定 ,优先级为0，数字越大，优先级越低
    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
