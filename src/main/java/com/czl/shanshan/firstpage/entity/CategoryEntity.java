package com.czl.shanshan.firstpage.entity;

import java.util.Date;

import com.czl.shanshan.common.entity.BaseEntity;

/**
 * 商品种类
 * @author ZengliuChen
 * @date 2017年7月17日 22:54:09
 */
public class CategoryEntity extends BaseEntity {
	
	private Boolean isUse;
	
	private String key;
	
	private Integer level;
	
	private String name;
	
	private Integer paixu;
	
	private Long pid;
	
	private String type;
	
	private Long userId;
	
	private Date dateAdd;

	public Boolean getIsUse() {
		return isUse;
	}

	public void setIsUse(Boolean isUse) {
		this.isUse = isUse;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
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

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
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

	public Date getDateAdd() {
		return dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}
	
}
