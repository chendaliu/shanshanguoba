package com.czl.shanshan.interfaces.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;



import com.czl.shanshan.order.entity.OrderEntity;
import com.czl.shanshan.order.service.IOrderService;
import com.czl.shanshan.interfaces.common.util.RestUtil;
import com.czl.shanshan.interfaces.service.IRsOrderService;

public class RsOrderService implements IRsOrderService {

	/**
	 *service
	 */
	@Autowired
	private IOrderService orderService;
	
	@Override
   public String createOrder(String record)
	{
		String js;
		Integer result=0;
		try {
			result = this.orderService.createOrder(record);
			js = RestUtil.responseDataSuccess(result);
		} catch (Exception e) {
			js = RestUtil.responseDataFailure(result, e.getMessage());
		}
		return js;
		
	}
	
	
}
