package com.networkConfigService.dao;

import java.util.Collection;
import com.networkConfigService.entities.NetworkNode;

public interface NetworkNodeDAO {

	public Collection<NetworkNode> getNetworkNode(Integer nodeId);
	public Collection<NetworkNode> getAllNetworkNodes();
	public void deleteNetworkNode(Integer nodeId);
	public void updateNetworkNode(Integer nodeId, String location, Double latitude, Double longtitude);
	public void addNetworkNode(Integer nodeId, String nodeName, String location, Double latitude, Double longtitude);
}
