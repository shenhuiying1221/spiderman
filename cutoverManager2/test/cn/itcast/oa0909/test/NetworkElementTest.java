package cn.itcast.oa0909.test;

import java.util.ArrayList;


import org.junit.Test;

import cn.scmcc.cutover.domain.NetworkElement;
import cn.scmcc.cutover.service.NetworkElementService;


public class NetworkElementTest extends BaseSpring{
	@Test
	public void getAllNetworkElementByProjectID(){
		NetworkElementService networkElementService = (NetworkElementService) context.getBean("networkElementService");
		ArrayList<NetworkElement> networkElements = (ArrayList<NetworkElement>) networkElementService.getAllNetworkElementByProjectID("1111");
		if (networkElements.size()>0){
			for (NetworkElement networkElement : networkElements){
				System.out.println(networkElement.getNeName());
			}
		}else{
			System.out.println("无此信息");
		}		
	}
	@Test
	public void saveNetworkElement(){
		NetworkElementService networkElementService = (NetworkElementService)context.getBean("networkElementService");
		NetworkElement networkElement = new NetworkElement();
		networkElement.setElementType("传输");
		networkElement.setEndNeName("\"\"");
		networkElement.setEndSignallingPoint("\"\"");
		networkElement.setEomsID("sc-09000-0000");	
		networkElement.setNeName("凉山九寨沟小学");
		networkElement.setOperator("欢乐");
		networkElement.setProjectID("0000");
		networkElement.setProjectName("凉山本地网SDH光缆割接");
		networkElement.setProjectType("本地割接");
		networkElement.setSourceSystem("集中故障");
		networkElementService.saveNetworkElement(networkElement);
	}
	@Test
	public void deleteNetworkElementByProjectID(){
		NetworkElementService networkElementService = (NetworkElementService)context.getBean("networkElementService");
		networkElementService.deleteNetworkElementByProjectID("0000");
	}
}
