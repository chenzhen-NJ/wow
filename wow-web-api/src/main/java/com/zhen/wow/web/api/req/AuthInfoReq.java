package com.zhen.wow.web.api.req;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @Comment
 * @Author CHENZHEN
 * @Date 2019/8/12 15:46
 */
@Data
public class AuthInfoReq implements Serializable {

	private static final long serialVersionUID = -2776638874314784591L;

	@NotBlank(message = "用户名不能为空")
	private String userName;

	@NotBlank(message = "密码不能为空")
	private String password;

	@NotBlank(message = "姓名不能为空")
	private String name;

	private Integer age;

	@NotBlank(message = "身份证ID不能为空")
	private String identityId;
}
