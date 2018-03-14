package cn.scmcc.cutover.struts2.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.BeanUtils;

import cn.scmcc.cutover.domain.CutoverOrder;
import cn.scmcc.cutover.domain.NetworkElement;
import cn.scmcc.cutover.service.CutoverOrderService;
import cn.scmcc.cutover.service.NetworkElementService;
import cn.scmcc.cutover.struts2.action.base.BaseAction;
import cn.scmcc.cutover.utils.MajorAndState;

import com.opensymphony.xwork2.ActionContext;



public class CutoverOrderAction extends BaseAction<CutoverOrder>{
	private CutoverOrderService cutoverOrderService;
	private NetworkElementService networkElementService;
	
//	private String id;
//	
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}

	public NetworkElementService getNetworkElementService() {
		return networkElementService;
	}

	public void setNetworkElementService(NetworkElementService networkElementService) {
		this.networkElementService = networkElementService;
	}

	public CutoverOrderService getCutoverOrderService() {
		return cutoverOrderService;
	}

	public void setCutoverOrderService(CutoverOrderService cutoverOrderService) {
		this.cutoverOrderService = cutoverOrderService;
	}
	
	public String getAllCutoverOrder(){
		Collection<CutoverOrder> cutoverOrderList = this.cutoverOrderService.getAllCutoverOrder();
//		//把一个对象放入map栈中
		ActionContext.getContext().put("cutoverOrderList", cutoverOrderList);
		Object action = ActionContext.getContext().getActionInvocation().getAction();
		action.getClass().getDeclaredFields();
		return listAction;
	}
	public String deleteCutoverOrderByID(){
		System.out.println("-----------------------");
//		HttpServletRequest request = ServletActionContext.getRequest();  
//		String id = request.getParameter("id");
//		System.out.println(id);
		System.out.println(this.getModel().getId());
		this.cutoverOrderService.deleteCutoverOrderById(this.getModel().getId());
//		this.cutoverOrderService.deleteCutoverOrderById(id);
		return action2action;
	}
	public String updateUI(){
		System.out.println("----------------------");
		System.out.println(this.getModel().getId());
		CutoverOrder cutoverOrder = this.cutoverOrderService.getCutoverOrderById(this.getModel().getId());
		
		ActionContext.getContext().getValueStack().getRoot().add(0,cutoverOrder);
		return updateUI;
	}
	public String update(){
		/**
		 * 1、先根据id把该数据从数据库中提取出来(或者从session的缓存中)
		 * 2、把修改以后的数据赋值到该对象中
		 * 3、针对该对象进行update操作
		 */
		CutoverOrder cutoverOrder = this.cutoverOrderService.getCutoverOrderById(this.getModel().getId());
		System.out.println(this.getModel().getOrderNumber());
		BeanUtils.copyProperties(this.getModel(),cutoverOrder);
		this.cutoverOrderService.updateCutoverOrder(cutoverOrder);
		return action2action;
	}
	public String startCutoverUI(){
//		System.out.println("----------------------");
//		System.out.println(this.getModel().getId());
		CutoverOrder cutoverOrder = this.cutoverOrderService.getCutoverOrderById(this.getModel().getId());
		
		ActionContext.getContext().getValueStack().getRoot().add(0,cutoverOrder);
		return "startCutoverUI";
	}
	public String startCutover() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();  
		String cooperatorName = request.getParameter("cooperatorName");
		String cooperatorPhone = request.getParameter("cooperatorPhone");
		String id = request.getParameter("id");
		System.out.println("--------------------");
		System.out.println(id);
		System.out.println(cooperatorName);
		System.out.println(cooperatorPhone);

		CutoverOrder cutoverOrder = cutoverOrderService.getCutoverOrderById(id);
		cutoverOrder.setCooperatorName(cooperatorName);
		cutoverOrder.setCooperatorPhone(cooperatorPhone);
		cutoverOrder.setCutoverState(MajorAndState.STARTED);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = sdf.format(date);
		cutoverOrder.setRealStartTime(sdf.parse(dateString));
		cutoverOrderService.updateCutoverOrder(cutoverOrder);
		return action2action;
	}
	public String cancelCutoverUI(){
//		System.out.println("----------------------");
//		System.out.println(this.getModel().getId());
		CutoverOrder cutoverOrder = this.cutoverOrderService.getCutoverOrderById(this.getModel().getId());
		
		ActionContext.getContext().getValueStack().getRoot().add(0,cutoverOrder);
		return "cancelCutoverUI";
	}
	public String cancelCutover() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();  
		String id = request.getParameter("id");
		CutoverOrder cutoverOrder = cutoverOrderService.getCutoverOrderById(id);
		String cancelReason=request.getParameter("cancelReason");
		cutoverOrder.setCancelReason(cancelReason);
		
		if(cutoverOrder.getCutoverState().equals(MajorAndState.NOTSTART)){
			cutoverOrder.setCutoverState(MajorAndState.CANCEL);
			
		}
		else if(cutoverOrder.getCutoverState().equals(MajorAndState.STARTED)){
			cutoverOrder.setCutoverState(MajorAndState.FAIL);
		}	
		//调用webservice接口取消工程预约

		
		//如何取消成功，则更新工程预约取消时间
		Date date = new Date();		
		cutoverOrderService.updateCutoverOrder(cutoverOrder);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = sdf.format(date);
		cutoverOrder.setProjectReservationCancelTime(sdf.parse(dateString));
		//更新数据库	
		cutoverOrderService.updateCutoverOrder(cutoverOrder);
		return action2action;
	}
	public String finishCutover() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();  
		String id = request.getParameter("id");
		CutoverOrder cutoverOrder = cutoverOrderService.getCutoverOrderById(id);
		Date applyEndTime = cutoverOrder.getApplyEndTime();		
		Date date = new Date();
		if(date.compareTo(applyEndTime)>=0){
			cutoverOrder.setCutoverState(MajorAndState.OVERTIME);	
			
		}
		else{
			cutoverOrder.setCutoverState(MajorAndState.FINISH);
			
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = sdf.format(date);
		cutoverOrder.setRealEndTime(sdf.parse(dateString));
		cutoverOrderService.updateCutoverOrder(cutoverOrder);

		//调用webservice接口取消工程预约		
		
		
		//如何取消成功，则更新工程预约取消时间
		 date = new Date();		
		cutoverOrderService.updateCutoverOrder(cutoverOrder);
		dateString = sdf.format(date);
		cutoverOrder.setProjectReservationCancelTime(sdf.parse(dateString));
		//更新数据库		
		cutoverOrderService.updateCutoverOrder(cutoverOrder);		
		
		return action2action;
	}
	public String fileCutover() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();  
		String id = request.getParameter("id");
		CutoverOrder cutoverOrder = cutoverOrderService.getCutoverOrderById(id);
		String projectReservationID = cutoverOrder.getProjectReservationID();
		System.out.println(projectReservationID);
		ArrayList<NetworkElement> networkElementList = (ArrayList<NetworkElement>) networkElementService.getAllNetworkElementByProjectID(projectReservationID);
		List<String> neNameList = new ArrayList<String>();
		for(NetworkElement networkElement : networkElementList){
			neNameList.add(networkElement.getNeName());
			System.out.println(networkElement.getNeName());
			//调用webservice接口，查询告警
		}
		
		return action2action;
		
	}	
	
}
