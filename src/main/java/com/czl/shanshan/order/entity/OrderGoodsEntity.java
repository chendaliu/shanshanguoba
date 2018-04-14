package com.czl.shanshan.order.entity;

import java.util.Date;

import com.czl.shanshan.common.entity.BaseEntity;

public class OrderGoodsEntity  {

	 private Integer id;

	 private String ordernum;
	    private Integer goodsid;

	    private Integer number;

	    private String propertychildids;

	    private String logisticstype;

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public Integer getGoodsid() {
	        return goodsid;
	    }

	    public void setGoodsid(Integer goodsid) {
	        this.goodsid = goodsid;
	    }
	    public String getOrdernum() {
	        return ordernum;
	    }

	    public void setOrdernum(String ordernum) {
	        this.ordernum = ordernum == null ? null : ordernum.trim();
	    }
	    public Integer getNumber() {
	        return number;
	    }

	    public void setNumber(Integer number) {
	        this.number = number;
	    }

	    public String getPropertychildids() {
	        return propertychildids;
	    }

	    public void setPropertychildids(String propertychildids) {
	        this.propertychildids = propertychildids == null ? null : propertychildids.trim();
	    }

	    public String getLogisticstype() {
	        return logisticstype;
	    }

	    public void setLogisticstype(String logisticstype) {
	        this.logisticstype = logisticstype == null ? null : logisticstype.trim();
	    }
	
}
