package cn.scmcc.cutover.dao;

import java.util.Collection;

import cn.scmcc.cutover.domain.NetworkElement;

public interface NetworkElementDao {
	public void saveNetworkElement(NetworkElement networkElement);
	public void deleteNetworkElementByProjectID(String projectID);	
	public Collection<NetworkElement> getAllNetworkElementByProjectID(String projectID); 
}
