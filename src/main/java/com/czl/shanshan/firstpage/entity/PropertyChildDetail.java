package com.czl.shanshan.firstpage.entity;

/**
 * 属性细分类别详细、带价钱
 * @author ZengliuChen
 * @date 2017年7月14日 00:22:43
 */
public class PropertyChildDetail {

	private Long goodsId;
	
	private String propertyChildIds;
	
	private Integer stores;
	
	private Float price;
	
	/** 原价  */
	private Float originalPrice;

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public String getPropertyChildIds() {
		return propertyChildIds;
	}

	public void setPropertyChildIds(String propertyChildIds) {
		this.propertyChildIds = propertyChildIds;
	}

	public Integer getStores() {
		return stores;
	}

	public void setStores(Integer stores) {
		this.stores = stores;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(Float originalPrice) {
		this.originalPrice = originalPrice;
	}
	
}
