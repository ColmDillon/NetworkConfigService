/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.networkConfigService.daoImpl;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.*;

import com.networkConfigService.dao.CellDAO;
import com.networkConfigService.entities.Cell;

public class CellDAOImpl implements CellDAO {

	@PersistenceContext
	private EntityManager em;
	Logger log;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.networkConfigService.dao.CellDAO#getCell(java.lang.Integer)
	 */
	@Override
	public Cell getCell(Integer cell_id) {
		Query query = em.createQuery(
				"Select c from Cell where c.cell_id = :cell_id").setParameter(
				"cell_id", cell_id);

		Cell temp = null;
		List<Cell> cells = query.getResultList();
		System.out.println("Executed getCell");
		if (cells.isEmpty()) {
			System.out.println("Cell not found");
		} else {
			return cells.get(0);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.networkConfigService.dao.CellDAO#deleteCell(java.lang.Integer)
	 */
	@Override
	public void deleteCell(Integer cell_id) {
		Query query = em.createQuery(
				"Select c from Cell where c.cell_id = :cell_id").setParameter(
				"cell_id", cell_id);

		Cell temp = null;
		List<Cell> cells = query.getResultList();
		System.out.println("Executed getCell");
		if (cells.isEmpty()) {
			System.out.println("Cell not found");
		} else {
			em.remove(cells.get(0));
			System.out.println("Cell removed");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.networkConfigService.dao.CellDAO#editCell(java.lang.Integer,
	 * java.lang.String, java.lang.Integer)
	 */
	@Override
	public void editCell(Integer cell_id, String cell_name, Integer cell_range) {
		Query query = em.createQuery(
				"Select c from Cell where c.cell_id = :cell_id").setParameter(
				"cell_id", cell_id);

		Cell temp = null;
		List<Cell> cells = query.getResultList();

		if (cells.isEmpty()) {
			System.out.println("Cell not found");
		} else {
			temp = new Cell();
			temp.setId(cell_id);
			temp.setName(cell_name);
			temp.setRange(cell_range);
			em.persist(temp);
			System.out.println("Cell updated");
		}

	}

}
