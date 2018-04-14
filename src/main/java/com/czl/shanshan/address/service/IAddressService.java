package com.czl.shanshan.address.service;

import java.util.List;

import com.czl.shanshan.address.entity.AddressesEntity;

public interface IAddressService {

	
	/***
	 * 查用户邮寄地址列表
	 * 
	 * @return
	 */
	List<AddressesEntity> listAddress(String wxid);
	
	/***
	 * 查用户默认邮寄地址列表
	 * 
	 * @return
	 */
	AddressesEntity defaultAddress(String wxid);
	
	Integer addAddress(String record);
	
	//修改地址信息
	Integer updateAddress(String record);
	
	//修改默认地址信息
	Integer updateDefaultAddress(String record);
}
