package cn.scmcc.cutover.service.impl;

import java.util.Collection;

import cn.scmcc.cutover.dao.NetworkElementDao;
import cn.scmcc.cutover.domain.NetworkElement;
import cn.scmcc.cutover.service.NetworkElementService;

public class NetworkElementServiceImpl implements NetworkElementService {
	private NetworkElementDao networkElementDao;
	
	public NetworkElementDao getNetworkElementDao() {
		return networkElementDao;
	}

	public void setNetworkElementDao(NetworkElementDao networkElementDao) {
		this.networkElementDao = networkElementDao;
	}

	public void saveNetworkElement(NetworkElement networkElement) {
		this.networkElementDao.saveNetworkElement(networkElement);
	}

	public void deleteNetworkElementByProjectID(String projectID) {
		this.networkElementDao.deleteNetworkElementByProjectID(projectID);
	}

	public Collection<NetworkElement> getAllNetworkElementByProjectID(
			String projectID) {
		return this.networkElementDao.getAllNetworkElementByProjectID(projectID);
	}

}
