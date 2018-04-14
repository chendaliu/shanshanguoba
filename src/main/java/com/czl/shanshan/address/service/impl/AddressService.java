package com.czl.shanshan.address.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czl.shanshan.address.dao.IAddressDao;
import com.czl.shanshan.address.entity.AddressesEntity;
import com.czl.shanshan.address.service.IAddressService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import java.util.Date;
@Service
public class AddressService implements IAddressService {

	/**
	 * dao
	 */
	@Autowired
	public IAddressDao addressDao;
	
	@Override
	public List<AddressesEntity> listAddress(String wxid) {
		List<AddressesEntity> list = this.addressDao.listAddress(wxid);
		return list;
	}
	
	@Override
	public AddressesEntity defaultAddress(String wxid) {
		AddressesEntity entity = this.addressDao.defaultAddress(wxid);
		return entity;
	}
	
	
	@Override
	//public String addAddress(String param_linkMan,String param_mobile,Integer param_provinceId,Integer param_cityId,Integer param_districtId,String param_address,String param_code,String param_token)
	//{
		public Integer addAddress(String record)
		{
		AddressesEntity entity=JSON.parseObject(record, AddressesEntity.class);
		entity.setDateadd(new Date());
		Integer result=this.addressDao.addAddress(entity);
		return result;
		
	}
	
	@Override
	public Integer updateAddress(String record)
	{
	AddressesEntity entity=JSON.parseObject(record, AddressesEntity.class);
	Integer result=this.addressDao.updateAddress(entity);
	return result;
	}
	
	
	@Override
	public Integer updateDefaultAddress(String record)
	{
	AddressesEntity entity=JSON.parseObject(record, AddressesEntity.class);
	Integer result=this.addressDao.updateDefaultAddress(entity);
	return result;
	}

}
