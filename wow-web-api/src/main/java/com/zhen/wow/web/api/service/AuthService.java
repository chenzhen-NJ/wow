package com.zhen.wow.web.api.service;

import com.zhen.wow.web.api.req.AuthInfoReq;

/**
 * @Comment
 * @Author CHENZHEN
 * @Date 2019/8/12 14:57
 */
public interface AuthService {

	boolean registryAuth(AuthInfoReq req);

}
