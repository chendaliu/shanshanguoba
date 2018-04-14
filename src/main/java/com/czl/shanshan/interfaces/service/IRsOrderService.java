package com.czl.shanshan.interfaces.service;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * consumes： 指定处理请求的提交内容类型（Content-Type），例如application/json, text/html;
 * produces: 指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回
 */
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_JSON,"text/html;charset=UTF-8"})
public interface IRsOrderService {


	@POST
    @Path("/createOrder")
	String createOrder(String record);
	
	
}
