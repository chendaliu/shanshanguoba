package com.czl.shanshan.firstpage.service;

import java.util.List;

import com.czl.shanshan.firstpage.entity.BannerEntity;
import com.czl.shanshan.firstpage.entity.CategoryEntity;
import com.czl.shanshan.firstpage.entity.GoodsDetailEntity;
import com.czl.shanshan.firstpage.entity.GoodsEntity;
import com.czl.shanshan.firstpage.entity.PropertyChildDetail;

/**
 * 首页service
 * @author ZengliuChen
 * @date 2017年7月5日 18:19:14
 */
public interface IFirstPageService {
	
	/**
	 * 查询横幅列表
	 * @param bannerEntity
	 * @date 2017年7月5日 18:19:30
	 * @return
	 */
	List<BannerEntity> listBanners(BannerEntity bannerEntity);
	
	
	/**
	 * 通过商品种类查询商品列表
	 * @author ZengliuChen
	 * @date 2017年7月6日 09:27:03
	 * @return
	 */
	List<GoodsEntity> listGoods(Long categoryId);
	
	/**
	 * 查询商品详情
	 * @author ZengliuChen
	 * @date 2017年7月6日 15:14:43
	 * @param id
	 * @return
	 */
	GoodsDetailEntity getGoodsDetail(Long id);
	
	/**
	 * 获得商品价钱
	 * @param goodsId
	 * @param propertyChildIds
	 * @return
	 */
	PropertyChildDetail getPrice(Long goodsId, String propertyChildIds);
	
	/**
	 * 查询商品种类
	 * @return
	 */
	List<CategoryEntity> listCategaries();
}
