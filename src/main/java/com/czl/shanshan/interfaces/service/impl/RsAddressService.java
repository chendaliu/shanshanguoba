package com.czl.shanshan.interfaces.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.czl.shanshan.address.entity.AddressesEntity;
import com.czl.shanshan.address.service.IAddressService;
import com.czl.shanshan.interfaces.common.util.RestUtil;
import com.czl.shanshan.interfaces.service.IRsAddressService;



public class RsAddressService implements IRsAddressService {

	/**
	 *service
	 */
	@Autowired
	private IAddressService addressService;
	
	@Override
	public String listAddress(String wxid) {
		String js;
		List<AddressesEntity> list = null;
		try {
			list = this.addressService.listAddress(wxid);
			js = RestUtil.responseDataSuccess(list);
		} catch (Exception e) {
			js = RestUtil.responseDataFailure(list, e.getMessage());
		}
		return js;
	}
	
	@Override
	public String defaultAddress(String wxid) {
		String js;
		AddressesEntity entity = null;
		try {
			entity = this.addressService.defaultAddress(wxid);
			js = RestUtil.responseDataSuccess(entity);
		} catch (Exception e) {
			js = RestUtil.responseDataFailure(entity, e.getMessage());
		}
		return js;
	}
	
	@Override
	//publicc String addAddress(String param_linkMan,String param_mobile,Integer param_provinceId,Integer param_cityId,Integer param_districtId,String param_address,String param_code,String param_token)
	public String addAddress(String record)
	{
		String js;
		Integer result=0;
		try {
			result = this.addressService.addAddress(record);
			js = RestUtil.responseDataSuccess(result);
		} catch (Exception e) {
			js = RestUtil.responseDataFailure(result, e.getMessage());
		}
		return js;
		
	}
	
	
	@Override
	public String updateAddress(String record)
	{
		String js;
		Integer result=0;
		try {
			result = this.addressService.updateAddress(record);
			js = RestUtil.responseDataSuccess(result);
		} catch (Exception e) {
			js = RestUtil.responseDataFailure(result, e.getMessage());
		}
		return js;
		
	}
	
	@Override
	public String updateDefaultAddress(String record)
	{
		String js;
		Integer result=0;
		try {
			result = this.addressService.updateDefaultAddress(record);
			js = RestUtil.responseDataSuccess(result);
		} catch (Exception e) {
			js = RestUtil.responseDataFailure(result, e.getMessage());
		}
		return js;
		
	}
}
