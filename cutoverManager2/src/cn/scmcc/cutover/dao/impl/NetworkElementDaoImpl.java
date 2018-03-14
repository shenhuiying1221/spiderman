package cn.scmcc.cutover.dao.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.scmcc.cutover.dao.NetworkElementDao;
import cn.scmcc.cutover.domain.NetworkElement;

public class NetworkElementDaoImpl extends HibernateDaoSupport implements
		NetworkElementDao {

	public void saveNetworkElement(NetworkElement networkElement) {
		this.getHibernateTemplate().save(networkElement);
	}

	public void deleteNetworkElementByProjectID(String projectID) {
		ArrayList<NetworkElement> list = (ArrayList<NetworkElement>) this.getAllNetworkElementByProjectID(projectID);
		for(NetworkElement networkElement : list){
			this.getHibernateTemplate().delete(networkElement);
		}
		
	}

	public Collection<NetworkElement> getAllNetworkElementByProjectID(
			String projectID) {
		
		return this.getHibernateTemplate().find("from NetworkElement n where n.projectID=?",projectID);
	}

}
