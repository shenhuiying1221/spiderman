package cn.itcast.oa0909.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;

import org.junit.Test;

import com.google.gson.Gson;

import cn.scmcc.cutover.domain.CutoverOrder;
import cn.scmcc.cutover.domain.User;
import cn.scmcc.cutover.service.CutoverOrderService;


public class CutoverOrderTest extends BaseSpring{
	@Test
	public void getAllCutoverOrder(){
		CutoverOrderService cutoverOrderService = (CutoverOrderService) context.getBean("cutoverOrderService");
		ArrayList<CutoverOrder> cutoverOrders = (ArrayList<CutoverOrder>) cutoverOrderService.getAllCutoverOrder();
		for (CutoverOrder cutoverOrder : cutoverOrders){
			System.out.println(cutoverOrder.getOrderName());
		}
			
	}
	@Test
	public void getAllCutoverOrderByCity(){
		CutoverOrderService cutoverOrderService = (CutoverOrderService) context.getBean("cutoverOrderService");
		ArrayList<CutoverOrder> cutoverOrders = (ArrayList<CutoverOrder>) cutoverOrderService.getAllCutoverOrderByCity("凉山");
		for(CutoverOrder cutoverOrder:cutoverOrders){
			System.out.println(cutoverOrder.getOrderName());
		}
	}
	@Test
	public void getCutoverOrderById(){
		CutoverOrderService cutoverOrderService = (CutoverOrderService) context.getBean("cutoverOrderService");
		CutoverOrder cutoverOrder =  cutoverOrderService.getCutoverOrderById("12414132");
		System.out.println(cutoverOrder.getOrderNumber());
	}
	@Test
	public void deleteCutoverOrder(){
		CutoverOrderService cutoverOrderService = (CutoverOrderService) context.getBean("cutoverOrderService");
		cutoverOrderService.deleteCutoverOrderById("8ae68d2661e02c920161e02c95b80001");
		System.out.println("删除成功");
	}
	@Test
	public void saveCutoverOrder() throws Exception{
		CutoverOrderService cutoverOrderService = (CutoverOrderService) context.getBean("cutoverOrderService");
		CutoverOrder cutoverOrder = new CutoverOrder();
		cutoverOrder.setOrderName("甘孜二干割接");
		cutoverOrder.setOrderNumber("sc-0089-0000");
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		cutoverOrder.setCutoverdate(df.parse(df.format(date)));
		cutoverOrder.setGrade("B");
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		cutoverOrder.setApplyStartTime(df1.parse("2018-03-02 00:00:00"));
		cutoverOrder.setApplyEndTime(df1.parse("2018-03-02 03:00:00"));
		cutoverOrderService.saveCutoverOrder(cutoverOrder);
	}
	@Test
	public void updateCutoverOrder(){
		CutoverOrderService cutoverOrderService = (CutoverOrderService) context.getBean("cutoverOrderService");
		CutoverOrder cutoverOrder = cutoverOrderService.getCutoverOrderById("8ae68d2661e02eef0161e02ef2f70001");
		cutoverOrder.setCity("甘孜");
		cutoverOrder.setDepartment("甘孜传输维护组");
		cutoverOrder.setMajor("传输");
		cutoverOrder.setSubject("甘孜二干光缆割接");
		cutoverOrder.setIsNeedOpticalPowerTest("是");
		cutoverOrderService.updateCutoverOrder(cutoverOrder);	
	}
//	@Test
//	public void getDate(){
//		Date date = new Date();
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//		System.out.println(df.format(date));
//	}
	@Test
	public void getAllCutoverOrderByMajor(){
		CutoverOrderService cutoverOrderService = (CutoverOrderService) context.getBean("cutoverOrderService");
		Collection<CutoverOrder> cutoverOrders = cutoverOrderService.getAllCutoverOrderByMajor("传输");
		for(CutoverOrder cutoverOrder:cutoverOrders){
			System.out.println(cutoverOrder.getId());
		}	
	}
	@Test
	public void getAllCutoverOrderByCutoverState(){
		CutoverOrderService cutoverOrderService = (CutoverOrderService) context.getBean("cutoverOrderService");
		Collection<CutoverOrder> cutoverOrders = cutoverOrderService.getAllCutoverOrderByCutoverState("未开始");
		if(cutoverOrders.size()>0){
			for(CutoverOrder cutoverOrder:cutoverOrders){
				System.out.println(cutoverOrder.getId());
			}	
		}else{
			System.out.println("查无此单");
		}
		
	}
	
	@Test
	public void getAllCutoverOrderByMajorAndCutoverState(){
		CutoverOrderService cutoverOrderService = (CutoverOrderService) context.getBean("cutoverOrderService");
		Collection<CutoverOrder> cutoverOrders = cutoverOrderService.getAllCutoverOrderByMajorAndCutoverState("核心网","超时");
		if(cutoverOrders.size()>0){
			for(CutoverOrder cutoverOrder:cutoverOrders){
				System.out.println(cutoverOrder.getSubject());
			}	
		}else{
			System.out.println("查无此单");
		}
		
	}
	

}
