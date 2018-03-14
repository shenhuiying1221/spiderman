package cn.scmcc.cutover.struts2.action;

import java.util.Collection;



import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import cn.scmcc.cutover.domain.NetworkElement;
import cn.scmcc.cutover.service.NetworkElementService;
import cn.scmcc.cutover.struts2.action.base.BaseAction;

public class NetworkElementAction  extends BaseAction<NetworkElement> {
	private NetworkElementService networkElementService;

	public NetworkElementService getNetworkElementService() {
		return networkElementService;
	}

	public void setNetworkElementService(NetworkElementService networkElementService) {
		this.networkElementService = networkElementService;
	}
	public String getAllNetworkElementByProjectID(){
		
		HttpServletRequest request = ServletActionContext.getRequest();  
		String projectReservationID = request.getParameter("projectReservationID");
		Collection<NetworkElement> networkElements = this.networkElementService.getAllNetworkElementByProjectID(projectReservationID);
//		//把一个对象放入map栈中
		ActionContext.getContext().put("networkElements", networkElements);
		Object action = ActionContext.getContext().getActionInvocation().getAction();
		action.getClass().getDeclaredFields();
		return listAction;
	}
	public String deleteById(){
		System.out.println("-----------------------");
//		HttpServletRequest request = ServletActionContext.getRequest();  
//		String id = request.getParameter("id");
//		System.out.println(id);
		System.out.println(this.getModel().getProjectID());
		this.networkElementService.deleteNetworkElementByProjectID(this.getModel().getProjectID());
		return action2action;
	}
	
	
}
