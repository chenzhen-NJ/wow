package com.zhen.wow.auth.center.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhen.wow.remote.dto.authCenter.AuthorInfoDto;
import com.zhen.wow.remote.service.authCenter.AuthCenterService;

/**
 * @Comment
 * @Author CHENZHEN
 * @Date 2019/8/12 15:25
 */
@Service(interfaceClass = AuthCenterService.class)
public class AuthCenterSerivceImpl implements AuthCenterService {

	@Override
	public boolean registryAuth (AuthorInfoDto dto) {
		return true;
	}
}
