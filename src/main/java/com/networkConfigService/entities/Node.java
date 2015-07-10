package com.networkConfigService.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity(name="network_node")
public class Node implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long id;
	
	@Column
	private String nodeId;
	
	@Column
	private String location;
	
	@Column
	private double latitude;
	
	@Column
	private double longtitude;
	
	private List<Cell> nodeCells = new ArrayList<Cell>();
	
	
	public Node(){
			
	}
	
	
	
	

}
