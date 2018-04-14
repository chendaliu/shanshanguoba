package com.czl.shanshan.address.dao;

import java.util.List;

import com.czl.shanshan.address.entity.AddressesEntity;

public interface IAddressDao {
	List<AddressesEntity> listAddress(String wxid);
	
	AddressesEntity defaultAddress(String wxid);
	
	int addAddress(AddressesEntity record);
	
	int updateAddress (AddressesEntity record);
	
	int updateDefaultAddress (AddressesEntity record);
}
