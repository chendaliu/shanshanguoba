package com.czl.shanshan.firstpage.entity;

import java.util.Date;

import com.czl.shanshan.common.entity.BaseEntity;

/**
 * 横幅实体
 * @author ZengliuChen
 * @date 2017年7月5日 18:17:29
 */
public class BannerEntity extends BaseEntity {
	/** 添加时间 */
	private Date dateAdd;
	/** 商品id */
	private Long businessId;
	/** 商品链接地址 */
	private String linkUrl;
	/**排序 */
	private Integer paixu;
	/** 图片地址 */
	private String picUrl;
	private String remark;
	/** 状态 */
	private String status;
	/** 状态描述  */
	private String statusStr;
	private String title;
	private String type;
	private Long userId;
	
	public Date getDateAdd() {
		return dateAdd;
	}
	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}
	public String getLinkUrl() {
		return linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
	public Integer getPaixu() {
		return paixu;
	}
	public void setPaixu(Integer paixu) {
		this.paixu = paixu;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusStr() {
		return statusStr;
	}
	public void setStatusStr(String statusStr) {
		this.statusStr = statusStr;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getBusinessId() {
		return businessId;
	}
	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}
	
}
