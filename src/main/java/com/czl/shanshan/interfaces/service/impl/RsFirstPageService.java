package com.czl.shanshan.interfaces.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.czl.shanshan.firstpage.entity.BannerEntity;
import com.czl.shanshan.firstpage.entity.CategoryEntity;
import com.czl.shanshan.firstpage.entity.GoodsDetailEntity;
import com.czl.shanshan.firstpage.entity.GoodsEntity;
import com.czl.shanshan.firstpage.entity.PropertyChildDetail;
import com.czl.shanshan.firstpage.service.IFirstPageService;
import com.czl.shanshan.interfaces.common.util.RestUtil;
import com.czl.shanshan.interfaces.service.IRsFirstPageService;

/**
 * 首页接口
 * @author ZengliuChen
 * @date 2017年7月5日 17:58:36
 */
public class RsFirstPageService implements IRsFirstPageService {
	
	/**
	 * 首页service
	 */
	@Autowired
	private IFirstPageService firstPageService;
	
	/**
	 * 查询横幅列表
	 * @param bannerEntity
	 * @date 2017年7月5日 18:19:30
	 * @return
	 */
	@Override
	public String listBanners(String params) {
		String js;
		List<BannerEntity> list = null;
		try {
			list = this.firstPageService.listBanners(null);
			js = RestUtil.responseDataSuccess(list);
		} catch (Exception e) {
			js = RestUtil.responseDataFailure(list, e.getMessage());
		}
		return js;
	}

	/**
	 * 查询商品详情
	 * @author ZengliuChen
	 * @date 2017年7月6日 15:14:43
	 * @param id
	 * @return
	 */
	@Override
	public String goodsDetail(Long id) {
		GoodsDetailEntity entity = null;
		String js;
		try {
			entity = firstPageService.getGoodsDetail(id);
			js = RestUtil.responseDataSuccess(entity);
		} catch (Exception e) {
			js = RestUtil.responseDataFailure(entity, e.getMessage());
		}
		return js;
	}
	
	/**
	 * 通过商品种类查询商品列表
	 * @author ZengliuChen
	 * @date 2017年7月6日 09:27:03
	 * @return
	 */
	@Override
	public String listGoods(Long categoryId){
		String js;
		List<GoodsEntity> list = null;
		try {
			list = this.firstPageService.listGoods(categoryId);
			js = RestUtil.responseDataSuccess(list);
		} catch (Exception e) {
			js = RestUtil.responseDataFailure(list, e.getMessage());
		}
		return js;
	}
	
	/**
	 * 计算价钱
	 */
	@Override
	public String getPrice(Long goodsId, String propertyChildIds){
		String js = null;
		PropertyChildDetail dtl = null;
		try {
			dtl = this.firstPageService.getPrice(goodsId, propertyChildIds);
			js = RestUtil.responseDataSuccess(dtl);
		} catch (Exception e) {
			js = RestUtil.responseDataFailure(dtl, e.getMessage());
		}
		return js;
	}
	
	/**
	 * 查询商品种类
	 * @return
	 */
	public String listCategaries(){
		String js;
		List<CategoryEntity> list = null;
		try {
			list = this.firstPageService.listCategaries();
			js = RestUtil.responseDataSuccess(list);
		} catch (Exception e) {
			js = RestUtil.responseDataFailure(list, e.getMessage());
		}
		return js;
	}

}
