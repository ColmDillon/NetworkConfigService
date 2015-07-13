package com.networkConfigService.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@SuppressWarnings("serial")
@Entity(name="network_node")
public class NetworkNode implements Serializable{
	
	@Id
	@Column
	private Integer nodeId;
	
	@Column
	private String name;
	
	@Column
	private String location;
	
	@Column
	private Double latitude;
	
	@Column
	private Double longtitude;
	
	@Transient
	private List<Cell> nodeCells = new ArrayList<Cell>();
	
	
	public NetworkNode(){
			
	}
	
	public NetworkNode(Integer nodeId, String nodeName, String location, Double latitude, Double longtitude){
		this.nodeId = nodeId;
		this.name = nodeName;
		this.location = location;
		this.latitude = latitude;
		this.longtitude = longtitude;
	}

	
	
	public Integer getNodeId() {
		return nodeId;
	}

	public void setNodeId(Integer nodeId) {
		this.nodeId = nodeId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(Double longtitude) {
		this.longtitude = longtitude;
	}

	public List<Cell> getNodeCells() {
		return nodeCells;
	}

	public void setNodeCells(List<Cell> nodeCells) {
		this.nodeCells = nodeCells;
	}
	
	

}
