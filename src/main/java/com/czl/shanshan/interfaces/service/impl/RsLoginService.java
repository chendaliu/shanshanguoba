package com.czl.shanshan.interfaces.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.czl.shanshan.interfaces.service.IRsLoginService;
import com.czl.shanshan.login.service.ILoginService;

/**
 * 登陆
 * @author ZengliuChen
 * @date 2017年8月1日 23:00:50
 */
public class RsLoginService implements IRsLoginService {

	@Autowired
	private ILoginService loginService;
	
	/**
	 * 登陆
	 * @param bannerEntity
	 * @date 2017年7月5日 18:19:30
	 * @return
	 */
	@Override
	public String onLogin(String params) {
		loginService.onLogin(params);
		return null;
	}

}
