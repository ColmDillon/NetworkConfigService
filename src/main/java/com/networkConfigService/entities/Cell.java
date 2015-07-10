package com.networkConfigService.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "cells")
public class Cell implements Serializable {

	@Id
	@Column(name = "cell_id")
	private Integer id;

	@Column(name = "cell_name")
	private String name;

	@Column(name = "cell_range")
	private Integer range; // in km

	public Cell() {

	}

	/**
	 * @param id
	 *            : Unique identifier
	 * @param name
	 *            : Name of cell
	 * @param range
	 *            : Range in (km)
	 */
	public Cell(Integer id, String name, Integer range) {
		super();
		this.id = id;
		this.name = name;
		this.range = range;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the range
	 */
	public Integer getRange() {
		return range;
	}

	/**
	 * @param range
	 *            the range to set
	 */
	public void setRange(Integer range) {
		this.range = range;
	}

}
