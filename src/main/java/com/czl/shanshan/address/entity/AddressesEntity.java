package com.czl.shanshan.address.entity;

import java.util.Date;

import com.czl.shanshan.common.entity.BaseEntity;

public class AddressesEntity  extends BaseEntity {

	 private Long id;

	    private String linkman;

	    private String mobile;

	    private Integer provinceid;

	    private Integer cityid;

	    private Integer districtid;

	    private String address;

	    private String code;

	    private Short isdefault;

	    private Date dateadd;

	    private String wxuserid;

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getLinkman() {
	        return linkman;
	    }

	    public void setLinkman(String linkman) {
	        this.linkman = linkman == null ? null : linkman.trim();
	    }

	    public String getMobile() {
	        return mobile;
	    }

	    public void setMobile(String mobile) {
	        this.mobile = mobile == null ? null : mobile.trim();
	    }

	    public Integer getProvinceid() {
	        return provinceid;
	    }

	    public void setProvinceid(Integer provinceid) {
	        this.provinceid = provinceid;
	    }

	    public Integer getCityid() {
	        return cityid;
	    }

	    public void setCityid(Integer cityid) {
	        this.cityid = cityid;
	    }

	    public Integer getDistrictid() {
	        return districtid;
	    }

	    public void setDistrictid(Integer districtid) {
	        this.districtid = districtid;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address == null ? null : address.trim();
	    }

	    public String getCode() {
	        return code;
	    }

	    public void setCode(String code) {
	        this.code = code == null ? null : code.trim();
	    }

	    public Short getIsdefault() {
	        return isdefault;
	    }

	    public void setIsdefault(Short isdefault) {
	        this.isdefault = isdefault;
	    }

	    public Date getDateadd() {
	        return dateadd;
	    }

	    public void setDateadd(Date dateadd) {
	        this.dateadd = dateadd;
	    }

	    public String getWxuserid() {
	        return wxuserid;
	    }

	    public void setWxuserid(String wxuserid) {
	        this.wxuserid = wxuserid == null ? null : wxuserid.trim();
	    }
	
	
}
