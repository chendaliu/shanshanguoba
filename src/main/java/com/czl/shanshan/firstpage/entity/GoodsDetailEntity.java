package com.czl.shanshan.firstpage.entity;

import java.util.List;

import com.czl.shanshan.common.entity.BaseEntity;

/**
 * 商品明细
 * @author ZengliuChen
 * @date 2017年7月6日 00:03:17
 */
public class GoodsDetailEntity extends BaseEntity {
	
	/** 图片  */
	private List<GoodsDetailPictureEntity> pics;
	
	private String content;
	
	private GoodsEntity basicInfo;
	
	private List<GoodsPropertyEntity> properties;

	public List<GoodsDetailPictureEntity> getPics() {
		return pics;
	}

	public void setPics(List<GoodsDetailPictureEntity> pics) {
		this.pics = pics;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public GoodsEntity getBasicInfo() {
		return basicInfo;
	}

	public void setBasicInfo(GoodsEntity basicInfo) {
		this.basicInfo = basicInfo;
	}

	public List<GoodsPropertyEntity> getProperties() {
		return properties;
	}

	public void setProperties(List<GoodsPropertyEntity> properties) {
		this.properties = properties;
	}

}
