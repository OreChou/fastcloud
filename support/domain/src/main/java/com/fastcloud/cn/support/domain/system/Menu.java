package com.fastcloud.cn.support.domain.system;

import com.baomidou.mybatisplus.annotations.TableField;
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
@TableName("sys_menu")
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

	private Long menuId;
	private Long parentId;
	private String name;
	private String url;
    /**
     * 授权(多个用逗号分隔，如：user:list,user:create)

     */
	private String perms;
	private Integer type;
	private String icon;
    /**
     * 排序
     */
	@TableField("orderNum")
	private Integer orderNum;
	private Integer status;


}
