package cn.scmcc.cutover.struts2.action;

import java.io.PrintWriter;
import java.util.ArrayList;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import cn.scmcc.cutover.domain.CutoverOrder;
import cn.scmcc.cutover.domain.MainPageResultData;
import cn.scmcc.cutover.domain.User;
import cn.scmcc.cutover.service.CutoverOrderService;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;


public class JsonTestAction extends ActionSupport{
	
	private CutoverOrderService cutoverOrderService;

	public CutoverOrderService getCutoverOrderService() {
		return cutoverOrderService;
	}
	public void setCutoverOrderService(CutoverOrderService cutoverOrderService) {
		this.cutoverOrderService = cutoverOrderService;
	}
	public String test1() throws Exception{
//		HashMap<String, Object> map = new HashMap<String, Object>();
		User user = new User();
		user.setPassword("123456");
		user.setUserName("shy");
//		map.put("user", user);
//		map.put("number", 3);
		Gson gson = new Gson();
		String result = gson.toJson(user);
		System.out.println(result);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("result", result);	
		return "test";
	}
	public String test2() throws Exception{	
		MainPageResultData mainPageResultData = new MainPageResultData();
		ArrayList<CutoverOrder> cutoverOrderList = (ArrayList<CutoverOrder>) this.cutoverOrderService.getAllCutoverOrder();
		mainPageResultData.setCutoverOrderList(cutoverOrderList);
		
		mainPageResultData.setCancelCoreNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("核心网", "取消").size());
		mainPageResultData.setCancelPowerNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("动环", "取消").size());
		mainPageResultData.setCancelServiceNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("全业务", "取消").size());
		mainPageResultData.setCancelTotalNumber(cutoverOrderService.getAllCutoverOrderByCutoverState("取消").size());
		mainPageResultData.setCancelTransportNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("传输", "取消").size());
		mainPageResultData.setCancelWirelessNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("无线", "取消").size());

		mainPageResultData.setFinishCoreNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("核心网", "完成").size());
		mainPageResultData.setFinishPowerNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("动环", "完成").size());
		mainPageResultData.setFinishServiceNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("全业务", "完成").size());
		mainPageResultData.setFinishTotalNumber(cutoverOrderService.getAllCutoverOrderByCutoverState("已完成").size());
		mainPageResultData.setFinishTransportNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("传输", "完成").size());
		mainPageResultData.setFinishWirelessNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("无线", "完成").size());

		mainPageResultData.setOvertimeCoreNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("核心网", "超时").size());
		mainPageResultData.setOvertimePowerNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("动环", "超时").size());
		mainPageResultData.setOvertimeServiceNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("全业务", "超时").size());
		mainPageResultData.setOvertimeTotalNumber(cutoverOrderService.getAllCutoverOrderByCutoverState("超时").size());
		mainPageResultData.setOvertimeTransportNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("传输", "超时").size());
		mainPageResultData.setOvertimeWirelessNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("无线", "超时").size());

		mainPageResultData.setStartedCoreNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("核心网", "开始").size());
		mainPageResultData.setStartedPowerNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("动环", "开始").size());
		mainPageResultData.setStartedServiceNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("全业务", "开始").size());
		mainPageResultData.setStartedTotalNumber(cutoverOrderService.getAllCutoverOrderByCutoverState("开始").size());
		mainPageResultData.setStartedTransportNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("传输", "开始").size());
		mainPageResultData.setStartedWirelessNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("无线", "开始").size());

		mainPageResultData.setNotStartCoreNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("核心网", "未开始").size());
		mainPageResultData.setNotStartPowerNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("动环", "未开始").size());
		mainPageResultData.setNotStartServiceNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("全业务", "未开始").size());
		mainPageResultData.setNotStartTotalNumber(cutoverOrderService.getAllCutoverOrderByCutoverState("未开始").size());
		mainPageResultData.setNotStartTransportNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("传输", "未开始").size());
		mainPageResultData.setNotStartWirelessNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("无线", "未开始").size());
		
		mainPageResultData.setFailCoreNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("核心网", "失败").size());
		mainPageResultData.setFailPowerNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("动环", "失败").size());
		mainPageResultData.setFailServiceNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("全业务", "失败").size());
		mainPageResultData.setFailTotalNumber(cutoverOrderService.getAllCutoverOrderByCutoverState("失败").size());
		mainPageResultData.setFailTransportNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("传输", "失败").size());
		mainPageResultData.setFailWirelessNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("无线", "失败").size());

		Gson gson = new Gson();
		String result = gson.toJson(mainPageResultData);
		System.out.println(result);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("result", result);	
		
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out = response.getWriter();

		out.print(result);
		out.flush();
		out.close();
		
		return "null";
	}
	
	
}
