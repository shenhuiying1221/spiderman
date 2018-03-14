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
import cn.scmcc.cutover.utils.MajorAndState;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;


public class MainPageAction extends ActionSupport{
	
	private CutoverOrderService cutoverOrderService;

	public CutoverOrderService getCutoverOrderService() {
		return cutoverOrderService;
	}
	public void setCutoverOrderService(CutoverOrderService cutoverOrderService) {
		this.cutoverOrderService = cutoverOrderService;
	}
	
	public String getMainPageResultData() throws Exception{	
		MainPageResultData mainPageResultData = new MainPageResultData();
		ArrayList<CutoverOrder> cutoverOrderList = (ArrayList<CutoverOrder>) this.cutoverOrderService.getAllCutoverOrder();
		mainPageResultData.setCutoverOrderList(cutoverOrderList);
		
		mainPageResultData.setCancelCoreNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.CORE, MajorAndState.CANCEL).size());
		mainPageResultData.setCancelPowerNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.POWER, MajorAndState.CANCEL).size());
		mainPageResultData.setCancelServiceNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.SERVICE, MajorAndState.CANCEL).size());
		mainPageResultData.setCancelTotalNumber(cutoverOrderService.getAllCutoverOrderByCutoverState(MajorAndState.CANCEL).size());
		mainPageResultData.setCancelTransportNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.TRANSPORT, MajorAndState.CANCEL).size());
		mainPageResultData.setCancelWirelessNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.WIRELESS, MajorAndState.CANCEL).size());
		mainPageResultData.setCancelOtherNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.OTHER, MajorAndState.CANCEL).size());
		
		mainPageResultData.setFinishCoreNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.CORE, MajorAndState.FINISH).size());
		mainPageResultData.setFinishPowerNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.POWER, MajorAndState.FINISH).size());
		mainPageResultData.setFinishServiceNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.SERVICE, MajorAndState.FINISH).size());
		mainPageResultData.setFinishTotalNumber(cutoverOrderService.getAllCutoverOrderByCutoverState(MajorAndState.FINISH).size());
		mainPageResultData.setFinishTransportNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.TRANSPORT, MajorAndState.FINISH).size());
		mainPageResultData.setFinishWirelessNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.WIRELESS, MajorAndState.FINISH).size());
		mainPageResultData.setFinishOtherNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.OTHER, MajorAndState.FINISH).size());

		
		mainPageResultData.setOvertimeCoreNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.CORE, MajorAndState.OVERTIME).size());
		mainPageResultData.setOvertimePowerNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.POWER, MajorAndState.OVERTIME).size());
		mainPageResultData.setOvertimeServiceNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.SERVICE, MajorAndState.OVERTIME).size());
		mainPageResultData.setOvertimeTotalNumber(cutoverOrderService.getAllCutoverOrderByCutoverState(MajorAndState.OVERTIME).size());
		mainPageResultData.setOvertimeTransportNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.TRANSPORT, MajorAndState.OVERTIME).size());
		mainPageResultData.setOvertimeWirelessNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.WIRELESS, MajorAndState.OVERTIME).size());
		mainPageResultData.setOvertimeOtherNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.OTHER, MajorAndState.OVERTIME).size());

		
		mainPageResultData.setStartedCoreNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.CORE, MajorAndState.STARTED).size());
		mainPageResultData.setStartedPowerNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.POWER, MajorAndState.STARTED).size());
		mainPageResultData.setStartedServiceNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.SERVICE, MajorAndState.STARTED).size());
		mainPageResultData.setStartedTotalNumber(cutoverOrderService.getAllCutoverOrderByCutoverState(MajorAndState.STARTED).size());
		mainPageResultData.setStartedTransportNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.TRANSPORT, MajorAndState.STARTED).size());
		mainPageResultData.setStartedWirelessNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.WIRELESS, MajorAndState.STARTED).size());
		mainPageResultData.setStartedOtherNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.OTHER, MajorAndState.STARTED).size());

		
		mainPageResultData.setNotStartCoreNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.CORE, MajorAndState.NOTSTART).size());
		mainPageResultData.setNotStartPowerNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.POWER, MajorAndState.NOTSTART).size());
		mainPageResultData.setNotStartServiceNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.SERVICE, MajorAndState.NOTSTART).size());
		mainPageResultData.setNotStartTotalNumber(cutoverOrderService.getAllCutoverOrderByCutoverState(MajorAndState.NOTSTART).size());
		mainPageResultData.setNotStartTransportNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.TRANSPORT, MajorAndState.NOTSTART).size());
		mainPageResultData.setNotStartWirelessNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.WIRELESS, MajorAndState.NOTSTART).size());
		mainPageResultData.setNotStartOtherNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.OTHER, MajorAndState.NOTSTART).size());

		
		mainPageResultData.setFailCoreNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.CORE, MajorAndState.FAIL).size());
		mainPageResultData.setFailPowerNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.POWER, MajorAndState.FAIL).size());
		mainPageResultData.setFailServiceNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.SERVICE, MajorAndState.FAIL).size());
		mainPageResultData.setFailTotalNumber(cutoverOrderService.getAllCutoverOrderByCutoverState(MajorAndState.FAIL).size());
		mainPageResultData.setFailTransportNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.TRANSPORT, MajorAndState.FAIL).size());
		mainPageResultData.setFailWirelessNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.WIRELESS, MajorAndState.FAIL).size());
		mainPageResultData.setFailOtherNumber(cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState(MajorAndState.OTHER,MajorAndState.FAIL).size());

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
