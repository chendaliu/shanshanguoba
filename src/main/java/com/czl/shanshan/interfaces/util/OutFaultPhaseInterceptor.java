package com.czl.shanshan.interfaces.util;

import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

public class OutFaultPhaseInterceptor extends AbstractPhaseInterceptor<Message> {
	
	private static final String RESUT_CODE = "ResultCode";

	public OutFaultPhaseInterceptor() {
		super(Phase.PRE_PROTOCOL);
	}

	@Override
	public void handleMessage(Message message) throws Fault {
		Object obj = message.get("HTTP.RESPONSE");
		if(obj != null){
			HttpServletResponse rs = (HttpServletResponse)obj;
			rs.setHeader(RESUT_CODE, "0");
		}
	}
}
