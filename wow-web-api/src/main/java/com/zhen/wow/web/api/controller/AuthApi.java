package com.zhen.wow.web.api.controller;

import com.zhen.wow.web.api.req.AuthInfoReq;
import com.zhen.wow.web.api.service.AuthService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Comment 用户API
 * @Author CHENZHEN
 * @Date 2019/8/12 14:29
 */
@RestController(value = "/web/api")
@Api(value = "用户API")
@Slf4j
public class AuthApi {

	@Autowired
	private AuthService authService;

	@PostMapping(value = "/registryAuth")
	public boolean registryAuth(@Validated AuthInfoReq req) {
		return authService.registryAuth(req);
	}

}
