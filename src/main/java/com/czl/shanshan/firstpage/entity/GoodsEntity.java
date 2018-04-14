package com.czl.shanshan.firstpage.entity;

import java.util.Date;

import com.czl.shanshan.common.entity.BaseEntity;

/**
 * 商品
 * @author ZengliuChen
 * @date 2017年7月6日 09:37:01
 */
public class GoodsEntity extends BaseEntity {
	private String categoryId;
	/** 特性 */
	private String characteristic; //": "一扫干燥粗糙泛红肌肤",
	/** 添加时间 */
	private Date dateAdd;
	/** 后勤id？物流id？ */
	private Long logisticsId;
	
	private Integer minPrice;
	
	private String name; // "兰蔻 水份缘舒缓凝霜50ml 补水保湿滋润修护面霜日霜专柜正品",
	private Integer numberFav;// 0,
	private Integer numberGoodReputation;//: 0,
	private Integer numberOrders;// 0,
	private Integer originalPrice;//: 980,
	/**排序 */
	private Integer paixu;
	
	private String pic;//": "https://cdn.it120.cc/apifactory/2017/04/26/035873b5e43912b80e4023bd7a7402db.jpg",
	private Integer recommendStatus;//": 0,
	
	private String recommendStatusStr;//": "普通",
	private Integer shopId; //: 0,
	private Integer status;//": 0,
	private String statusStr;//": "上架",
	/** 库存 */
	private Integer stores;//: 99,
	private Long userId;//: 51,
	private Long views; //: 1931
	
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCharacteristic() {
		return characteristic;
	}
	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}
	public Date getDateAdd() {
		return dateAdd;
	}
	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}
	public Long getLogisticsId() {
		return logisticsId;
	}
	public void setLogisticsId(Long logisticsId) {
		this.logisticsId = logisticsId;
	}
	public Integer getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(Integer minPrice) {
		this.minPrice = minPrice;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumberFav() {
		return numberFav;
	}
	public void setNumberFav(Integer numberFav) {
		this.numberFav = numberFav;
	}
	public Integer getNumberGoodReputation() {
		return numberGoodReputation;
	}
	public void setNumberGoodReputation(Integer numberGoodReputation) {
		this.numberGoodReputation = numberGoodReputation;
	}
	public Integer getNumberOrders() {
		return numberOrders;
	}
	public void setNumberOrders(Integer numberOrders) {
		this.numberOrders = numberOrders;
	}
	public Integer getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(Integer originalPrice) {
		this.originalPrice = originalPrice;
	}
	public Integer getPaixu() {
		return paixu;
	}
	public void setPaixu(Integer paixu) {
		this.paixu = paixu;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public Integer getRecommendStatus() {
		return recommendStatus;
	}
	public void setRecommendStatus(Integer recommendStatus) {
		this.recommendStatus = recommendStatus;
	}
	public String getRecommendStatusStr() {
		return recommendStatusStr;
	}
	public void setRecommendStatusStr(String recommendStatusStr) {
		this.recommendStatusStr = recommendStatusStr;
	}
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getStatusStr() {
		return statusStr;
	}
	public void setStatusStr(String statusStr) {
		this.statusStr = statusStr;
	}
	public Integer getStores() {
		return stores;
	}
	public void setStores(Integer stores) {
		this.stores = stores;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getViews() {
		return views;
	}
	public void setViews(Long views) {
		this.views = views;
	}
	
}
