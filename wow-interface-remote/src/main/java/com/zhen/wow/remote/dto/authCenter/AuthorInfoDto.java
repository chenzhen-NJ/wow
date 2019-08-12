package com.zhen.wow.remote.dto.authCenter;

import lombok.Data;

import java.io.Serializable;

/**
 * @Comment
 * @Author CHENZHEN
 * @Date 2019/8/12 15:07
 */
@Data
public class AuthorInfoDto implements Serializable {

	private static final long serialVersionUID = 4597374136201137947L;

	private String uuid;

	private String userName;

	private String password;

	private String name;

	private Integer age;

	private String identityId;
}
