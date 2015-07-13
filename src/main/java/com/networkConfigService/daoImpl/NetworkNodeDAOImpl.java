package com.networkConfigService.daoImpl;

import java.util.Collection;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.networkConfigService.dao.NetworkNodeDAO;
import com.networkConfigService.entities.NetworkNode;

@Stateless
@Local
public class NetworkNodeDAOImpl implements NetworkNodeDAO {

	@PersistenceContext
	private EntityManager em;

	
	@Override
	public Collection<NetworkNode> getNetworkNode(Integer nodeId) {
		return em.createQuery("Select n from network_node n where n.nodeId = :networkNodeId")
				.setParameter("networkNodeId", nodeId)
				.getResultList();
	}
	
	public Collection<NetworkNode> getAllNetworkNodes(){
		return em.createQuery("Select n from node n")
				.getResultList();
	}

	@Override
	public void deleteNetworkNode(Integer nodeId) {
		em.remove(nodeId);
		
	}

	@Override
	public void updateNetworkNode(Integer nodeId, String location,
			Double latitude, Double longtitude) {
		em.createQuery("UPDATE network_node n SET n.location = :newLocation, n.latitude = :newLatitude, n.longtitude = :new longtitude WHERE n.nodeId = :nodeId")
		.setParameter("nodeId", nodeId)
		.setParameter("newLocation", location)
		.setParameter("newLatitude", latitude)
		.setParameter("newLongtitude", longtitude)
		.executeUpdate();
		
	}

	@Override
	public void addNetworkNode(Integer nodeId, String nodeName, String location,
			Double latitude, Double longtitude) {
		NetworkNode newNode = new NetworkNode(nodeId, nodeName, location, latitude, longtitude);
		em.persist(newNode);
		
	}
	
	
	
	
	

}
