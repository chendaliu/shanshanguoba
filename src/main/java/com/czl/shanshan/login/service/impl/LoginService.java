package com.czl.shanshan.login.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.czl.shanshan.common.util.Constant;
import com.czl.shanshan.common.util.HttpClientUtil;
import com.czl.shanshan.login.service.ILoginService;

@Service
public class LoginService implements ILoginService {

	private static String wxurl = "https://api.weixin.qq.com/sns/jscode2session";
		
	@SuppressWarnings("unchecked")
	@Override
	public String onLogin(String params) {
		HashMap<String, String> map = JSONArray.parseObject(params, HashMap.class);
		String jsCode = map.get("code");
		String url = wxurl + "?appid=" + Constant.APP_ID + "&secret=" + Constant.APP_SECRET + "&js_code=" + jsCode
				+ "&grant_type=authorization_cod";
		String result = HttpClientUtil.doGet(url);
		return result;
	}

}
