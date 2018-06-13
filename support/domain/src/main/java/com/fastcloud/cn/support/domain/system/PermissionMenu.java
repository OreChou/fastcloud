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
@TableName("sys_permission_menu")
public class PermissionMenu implements Serializable {

    private static final long serialVersionUID = 1L;

	private Long sysPermissionMenuId;
	private Long permissionId;
	private Long menuId;


}
