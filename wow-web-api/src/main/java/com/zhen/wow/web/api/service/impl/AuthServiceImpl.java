package com.zhen.wow.web.api.service.impl;

import com.zhen.wow.remote.dto.authCenter.AuthorInfoDto;
import com.zhen.wow.remote.service.authCenter.AuthCenterService;
import com.zhen.wow.web.api.req.AuthInfoReq;
import com.zhen.wow.web.api.service.AuthService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @Comment
 * @Author CHENZHEN
 * @Date 2019/8/12 14:57
 */
@Service
public class AuthServiceImpl implements AuthService {

	@Reference
	private AuthCenterService authCenterService;

	@Override
	public boolean registryAuth (AuthInfoReq req) {
		if (null == req) {
			return false;
		}

		AuthorInfoDto dto = new AuthorInfoDto();
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		dto.setUuid(uuid);
		dto.setUserName(req.getUserName());
		dto.setPassword(req.getPassword());
		dto.setName(req.getName());
		dto.setAge(req.getAge());
		dto.setIdentityId(req.getIdentityId());

		return authCenterService.registryAuth(dto);
	}
}
