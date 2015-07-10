package com.networkConfigService.ServiceImpl;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import com.networkConfigService.dao.NetworkNodeDAO;
import com.networkConfigService.entities.NetworkNode;
import com.networkConfigService.serviceLocal.NetworkNodeLocal;

@Local
@Stateless
public class NetworkNodeServiceImpl implements NetworkNodeLocal{

	@EJB
	private NetworkNodeDAO nnd;
	
	@Override
	public Collection<NetworkNode> getNetworkNode(Integer nodeId) {
		
		return nnd.getNetworkNode(nodeId);
	}

	@Override
	public Collection<NetworkNode> getAllNetworkNodes() {
		
		return nnd.getAllNetworkNodes();
	}

	@Override
	public void deleteNetworkNode(Integer nodeId) {
		
		nnd.deleteNetworkNode(nodeId);		
	}

	@Override
	public void updateNetworkNode(Integer nodeId, String location,
			Double latitude, Double longtitude) {
		
		nnd.updateNetworkNode(nodeId, location, latitude, longtitude);
		
	}

	@Override
	public void addNetworkNode(Integer nodeId, String location,
			Double latitude, Double longtitude) {
		
		nnd.addNetworkNode(nodeId, location, latitude, longtitude);
		
	}

}
