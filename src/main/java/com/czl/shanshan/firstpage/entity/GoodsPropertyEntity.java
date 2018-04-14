package com.czl.shanshan.firstpage.entity;

import java.util.Date;
import java.util.List;

import com.czl.shanshan.common.entity.BaseEntity;

/**
 * 商品属性实体
 * @author ZengliuChen
 * @date 2017年7月7日 21:56:05
 */
public class GoodsPropertyEntity extends BaseEntity {

	/** 添加时间 */
	private Date dateAdd;
	
	private String name;
	
	/**排序 */
	private Integer paixu;
	
	private Long goodsId;

	private List<ChildsCurGoodsEntity> childsCurGoods;
	
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

	public List<ChildsCurGoodsEntity> getChildsCurGoods() {
		return childsCurGoods;
	}

	public void setChildsCurGoods(List<ChildsCurGoodsEntity> childsCurGoods) {
		this.childsCurGoods = childsCurGoods;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}
}
