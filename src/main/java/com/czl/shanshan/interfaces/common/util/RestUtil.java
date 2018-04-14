package com.czl.shanshan.interfaces.common.util;

import com.alibaba.fastjson.JSONArray;
import com.czl.shanshan.interfaces.entity.ResponseEntity;

/**
 * rest 接口工具类
 * @author ZengliuChen
 * @date 2017年7月5日 18:48:57
 */
public class RestUtil {

	/**
	 * 调用接口成功，返回参数
	 * @param obj
	 * @return
	 */
	public static String responseDataSuccess(Object obj){
		ResponseEntity<Object> rp = new ResponseEntity<Object>();
		//为什么要用0表示成功？因为微信小程序里是这样的，保持一致！
		rp.setCode("0");
		rp.setMsg("success");
		rp.setData(obj);
		String js = JSONArray.toJSONString(rp);
		return js;
	}
	
	/**
	 * 调用接口失败，返回参数
	 * @param obj
	 * @return
	 */
	public static String responseDataFailure(Object obj, String msg){
		ResponseEntity<Object> rp = new ResponseEntity<Object>();
		rp.setCode("1");
		rp.setMsg(msg);
		rp.setData(obj);
		String js = JSONArray.toJSONString(rp);
		return js;
	}
}
