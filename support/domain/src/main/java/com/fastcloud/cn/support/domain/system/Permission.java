package com.fastcloud.cn.support.domain.system;

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
@TableName("sys_permission")
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

	private Long permissionId;
    /**
     * 父权限（可能会使用不到，默认为0）
     */
	private Long parentId;
	private String name;
    /**
     * 该权限能够使用的服务。如：auth-service;hello-service（服务之间用分号隔开）
     */
	private String services;
	private String description;
	private Integer status;


}
