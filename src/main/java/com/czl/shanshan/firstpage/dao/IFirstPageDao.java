package com.czl.shanshan.firstpage.dao;

import java.util.List;
import java.util.Map;

import com.czl.shanshan.firstpage.entity.BannerEntity;
import com.czl.shanshan.firstpage.entity.CategoryEntity;
import com.czl.shanshan.firstpage.entity.GoodsDetailEntity;
import com.czl.shanshan.firstpage.entity.GoodsEntity;
import com.czl.shanshan.firstpage.entity.PropertyChildDetail;

/**
 * 首页dao
 * @author ZengliuChen
 * @date 2017年7月5日 18:19:14
 */
public interface IFirstPageDao {
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
	List<GoodsEntity> listGoods(Map<String, Object> params);
	
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
	 * @param params
	 * @return
	 */
	PropertyChildDetail getPrice(Map<String, Object> params);
	
	/**
	 * 查询商品种类
	 * @return
	 */
	List<CategoryEntity> listCategaries();
}
