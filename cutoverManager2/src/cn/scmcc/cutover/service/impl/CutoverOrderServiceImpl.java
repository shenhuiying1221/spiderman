package cn.scmcc.cutover.service.impl;

import java.io.Serializable;
import java.util.Collection;

import cn.scmcc.cutover.dao.CutoverOrderDao;
import cn.scmcc.cutover.domain.CutoverOrder;
import cn.scmcc.cutover.service.CutoverOrderService;

public class CutoverOrderServiceImpl implements CutoverOrderService {
	
	private CutoverOrderDao cutoverOrderDao;

	public CutoverOrderDao getCutoverOrderDao() {
		return cutoverOrderDao;
	}

	public void setCutoverOrderDao(CutoverOrderDao cutoverOrderDao) {
		this.cutoverOrderDao = cutoverOrderDao;
	}

	public void saveCutoverOrder(CutoverOrder cutoverOrder) {
		this.cutoverOrderDao.saveCutoverOrder(cutoverOrder);
	}

	public void updateCutoverOrder(CutoverOrder cutoverOrder) {
		this.cutoverOrderDao.updateCutoverOrder(cutoverOrder);
	}

	public void deleteCutoverOrderById(Serializable id) {
		this.cutoverOrderDao.deleteCutoverOrderById(id);
	}

	public Collection<CutoverOrder> getAllCutoverOrder() {
		return this.cutoverOrderDao.getAllCutoverOrder();
	}

	public Collection<CutoverOrder> getAllCutoverOrderByCity(String city) {
		return this.cutoverOrderDao.getAllCutoverOrderByCity(city);
	}

	public CutoverOrder getCutoverOrderById(Serializable id) {
		return this.cutoverOrderDao.getCutoverOrderById(id);
	}

	public Collection<CutoverOrder> getAllCutoverOrderByMajor(String major) {
		// TODO Auto-generated method stub
		return this.cutoverOrderDao.getAllCutoverOrderByMajor(major);
	}

	public Collection<CutoverOrder> getAllCutoverOrderByCutoverState(
			String cutoverState) {
		// TODO Auto-generated method stub
		return this.cutoverOrderDao.getAllCutoverOrderByCutoverState(cutoverState);
	}

	public Collection<CutoverOrder> getAllCutoverOrderByMajorAndCutoverState(
			 String major,String cutoverState) {
		return this.cutoverOrderDao.getAllCutoverOrderByMajorAndCutoverState(major,cutoverState);
	}

	
}
