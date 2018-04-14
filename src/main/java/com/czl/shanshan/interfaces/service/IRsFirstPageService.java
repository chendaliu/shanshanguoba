package com.czl.shanshan.interfaces.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * consumes： 指定处理请求的提交内容类型（Content-Type），例如application/json, text/html;
 * produces: 指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回
 */
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_JSON,"text/html;charset=UTF-8"})
public interface IRsFirstPageService {

	/**
	 * 查询横幅列表
	 * @param bannerEntity
	 * @date 2017年7月5日 18:19:30
	 * @return
	 */
	@GET
    @Path("/listBanners")
	String listBanners(String params);
	
	/**
	 * 查询商品明细
	 * @author ZengliuChen
	 * @date 2017年7月6日 17:24:40
	 * @param id
	 * @return
	 */
	@GET
    @Path("/shop/goods/detail")
	String goodsDetail(@QueryParam("id") Long id);
	
	/**
	 * 查询商品列表
	 * @author ZengliuChen
	 * @date 2017年7月6日 09:27:03
	 * @return
	 */
	@GET
    @Path("/shop/goods/list")
	String listGoods(@QueryParam("categoryId") Long categoryId);
	
	
	/**
	 * 计算价钱
	 * @param goodsId
	 * @param propertyChildIds
	 * @return
	 */
	@GET
    @Path("/shop/goods/price")
	String getPrice(@QueryParam("goodsId") Long goodsId, 
			@QueryParam("propertyChildIds") String propertyChildIds);
	
	/**
	 * 查询商品种类列表
	 * @return
	 */
	@GET
    @Path("/shop/goods/listCategaries")
	String listCategaries();
	

}
