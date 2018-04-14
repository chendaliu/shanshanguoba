package com.czl.shanshan.order.dao;

import java.util.List;

import com.czl.shanshan.order.entity.OrderEntity;
public interface IOrderDao {
	int createOrder(OrderEntity record);
}
