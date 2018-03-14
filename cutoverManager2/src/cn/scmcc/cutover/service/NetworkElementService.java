package cn.scmcc.cutover.service;

import java.util.Collection;

import cn.scmcc.cutover.domain.NetworkElement;

public interface NetworkElementService {
	public void saveNetworkElement(NetworkElement networkElement);
	public void deleteNetworkElementByProjectID(String projectID);	
	public Collection<NetworkElement> getAllNetworkElementByProjectID(String projectID); 
}
