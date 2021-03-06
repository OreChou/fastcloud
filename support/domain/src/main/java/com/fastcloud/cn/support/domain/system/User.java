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
@TableName("sys_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

	private Long userId;
	private String username;
	private String password;
	private String phone;
	private String email;
	private String nickname;
	private String image;
	private Date createTime;
	private Date updateTime;
	private Integer status;


}
