package cn.scmcc.cutover.dao.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.scmcc.cutover.dao.CutoverOrderDao;
import cn.scmcc.cutover.domain.CutoverOrder;



public class CutoverOrderDaoImpl extends HibernateDaoSupport implements CutoverOrderDao{

	public void saveCutoverOrder(CutoverOrder cutoverOrder) {
		this.getHibernateTemplate().save(cutoverOrder);
	}

	public void updateCutoverOrder(CutoverOrder cutoverOrder) {
		this.getHibernateTemplate().update(cutoverOrder);
	}

	public void deleteCutoverOrderById(Serializable id) {
		CutoverOrder cutoverOrder = this.getCutoverOrderById(id);
		this.getHibernateTemplate().delete(cutoverOrder);
	}

	public Collection<CutoverOrder> getAllCutoverOrder() {
		return this.getHibernateTemplate().find("from CutoverOrder");
	}

	public Collection<CutoverOrder> getAllCutoverOrderByCity(String city) {
		return this.getHibernateTemplate().find("from CutoverOrder c where c.city=?",city);
	}

	public CutoverOrder getCutoverOrderById(Serializable id) {
		return (CutoverOrder) this.getHibernateTemplate().get(CutoverOrder.class, id);
	}

	public Collection<CutoverOrder> getAllCutoverOrderByMajor(String major) {
		return this.getHibernateTemplate().find("from CutoverOrder c where c.major=?",major);
	}

	public Collection<CutoverOrder> getAllCutoverOrderByCutoverState(
			String cutoverState) {
		return this.getHibernateTemplate().find("from CutoverOrder c where c.cutoverState=?",cutoverState);
	}

	public Collection<CutoverOrder> getAllCutoverOrderByMajorAndCutoverState(
			 String major,String cutoverState) {
		String values[]={major,cutoverState};
		return this.getHibernateTemplate().find("from CutoverOrder c where c.major=? and c.cutoverState=?",values);
	
	}

	

}
