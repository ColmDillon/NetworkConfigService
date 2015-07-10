package com.networkConfigService.serviceLocal;

import java.util.Collection;

import javax.ejb.Local;

import com.networkConfigService.entities.NetworkNode;

@Local
public interface NetworkNodeLocal {
	
	public Collection<NetworkNode> getNetworkNode(Integer nodeId);
	public Collection<NetworkNode> getAllNetworkNodes();
	public void deleteNetworkNode(Integer nodeId);
	public void updateNetworkNode(Integer nodeId, String location, Double latitude, Double longtitude);
	public void addNetworkNode(Integer nodeId, String location, Double latitude, Double longtitude);

}
