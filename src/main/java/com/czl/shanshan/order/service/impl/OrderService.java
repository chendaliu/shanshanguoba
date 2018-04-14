package com.czl.shanshan.order.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czl.shanshan.order.dao.IOrderDao;
import com.czl.shanshan.order.dao.IOrderGoodsDao;
import com.czl.shanshan.order.entity.OrderEntity;
import com.czl.shanshan.order.entity.OrderGoodsEntity;
import com.czl.shanshan.order.service.IOrderService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import java.util.Date;
import java.text.SimpleDateFormat; 
@Service
public class OrderService implements IOrderService {

	/**
	 * dao
	 */
	@Autowired
	public IOrderDao orderDao;
	@Autowired
	public IOrderGoodsDao orderGoodsDao;

	
	@Override
		public Integer createOrder(String record)
		{
		
		OrderEntity entity=JSON.parseObject(record, OrderEntity.class);
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String ordernum="Shanshan-"+dateFormater.format(new Date());
		entity.setOrdernum(ordernum);
		entity.setDateadd(new Date());
		
		List<OrderGoodsEntity> list= new ArrayList<OrderGoodsEntity>();  
		list=JSON.parseArray(entity.getGoodsJsonStr(), OrderGoodsEntity.class);
		for(OrderGoodsEntity oge:list)
		{ 
			oge.setOrdernum(ordernum);
			try{
			this.orderGoodsDao.createOrderGoods(oge);
			}catch(Exception ex)
			{
				
				System.out.print(ex.getMessage());
			}
		}
		Integer result=this.orderDao.createOrder(entity);
		
		
		return result;
		
	}
	


}
