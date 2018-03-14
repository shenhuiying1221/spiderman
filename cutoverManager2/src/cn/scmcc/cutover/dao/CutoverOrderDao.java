package cn.scmcc.cutover.dao;

import java.io.Serializable;
import java.util.Collection;

import cn.scmcc.cutover.domain.CutoverOrder;



public interface CutoverOrderDao {
	public void saveCutoverOrder(CutoverOrder cutoverOrder);
	public void updateCutoverOrder(CutoverOrder cutoverOrder);
	public void deleteCutoverOrderById(Serializable id);	
	public Collection<CutoverOrder> getAllCutoverOrder(); 
	public Collection<CutoverOrder> getAllCutoverOrderByCity(String city);
	public Collection<CutoverOrder> getAllCutoverOrderByMajor(String major); 
	public CutoverOrder getCutoverOrderById(Serializable id);
	public Collection<CutoverOrder> getAllCutoverOrderByCutoverState(String cutoverState); 
	public Collection<CutoverOrder> getAllCutoverOrderByMajorAndCutoverState(String major,String cutoverState); 
}
