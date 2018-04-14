package com.czl.shanshan.firstpage.entity;

import java.util.Date;

import com.czl.shanshan.common.entity.BaseEntity;

/**
 * 商品属性实体下面的列表类
 * @author ZengliuChen
 * @date 2017年7月7日 22:07:54
 */
public class ChildsCurGoodsEntity extends BaseEntity {

	private Date dateAdd;
	
	private String name;
	
	private Integer paixu;
	
	private Long propertyId;
	
	private String remark;
	
	private Long goodsId;
	
	public Date getDateAdd() {
		return dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPaixu() {
		return paixu;
	}

	public void setPaixu(Integer paixu) {
		this.paixu = paixu;
	}

	public Long getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

}
