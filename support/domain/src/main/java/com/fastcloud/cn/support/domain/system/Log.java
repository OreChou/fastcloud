package com.fastcloud.cn.support.domain.system;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author OreChou
 * @since 2018-06-13
 */
@Data
@EqualsAndHashCode()
@Accessors(chain = true)
@TableName("sys_log")
public class Log implements Serializable {

    private static final long serialVersionUID = 1L;

	private Long logId;
    /**
     * 用户名
     */
	private String username;
    /**
     * 操作
     */
	private String operation;
    /**
     * 请求方法
     */
	private String method;
    /**
     * 请求参数
     */
	private String params;
    /**
     * 执行时长
     */
	private Long time;
    /**
     * IP地址
     */
	private String ip;
	private Date createTime;


}
