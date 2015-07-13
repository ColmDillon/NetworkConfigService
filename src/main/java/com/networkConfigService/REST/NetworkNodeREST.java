package com.networkConfigService.REST;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.networkConfigService.entities.NetworkNode;
import com.networkConfigService.serviceLocal.NetworkNodeLocal;

@Path("/network")
public class NetworkNodeREST {

	
	@EJB
	private NetworkNodeLocal nnl;
	

	@GET
	@Path("/getNode")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<NetworkNode> getNetworkNode(
		@QueryParam("nodeId") Integer nodeId) {
		return nnl.getNetworkNode(nodeId);
	}

	//comment
	@GET
	@Path("/getAllNodes")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<NetworkNode> getAllNetworkNodes(){
		return nnl.getAllNetworkNodes();
	}

	
	@DELETE
	@Path("/deleteNode")
	public void deleteNetworkNode(
		@QueryParam("nodeId") Integer nodeId){
		nnl.deleteNetworkNode(nodeId);		
	}

	
	@PUT
	@Path("/updateNode")
	public void updateNetworkNode(
			@QueryParam("nodeId") Integer nodeId,
			@QueryParam("location") String	location,
			@QueryParam("latitude") Double latitude,
			@QueryParam("longtitude") Double longtitude) {
			nnl.updateNetworkNode(nodeId, location, latitude, longtitude);
	}

	
	@POST
	@Path("/addNode")
	public void addNetworkNode(@QueryParam("nodeId") Integer nodeId,
			@QueryParam("nodeName") String	nodeName,
			@QueryParam("nodeLocation") String	location,
			@QueryParam("latitude") Double latitude,
			@QueryParam("longtitude") Double longtitude) {
			nnl.addNetworkNode(nodeId, nodeName, location, latitude, longtitude);
		
	}

}
