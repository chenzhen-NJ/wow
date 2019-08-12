package com.zhen.wow.remote.service.authCenter;

import com.zhen.wow.remote.dto.authCenter.AuthorInfoDto;

/**
 * @Comment
 * @Author CHENZHEN
 * @Date 2019/8/12 14:59
 */
public interface AuthCenterService {

	/**
	 * 注册用户
	 *
	 * @param dto
	 * @return
	 */
	boolean registryAuth(AuthorInfoDto dto);
}
