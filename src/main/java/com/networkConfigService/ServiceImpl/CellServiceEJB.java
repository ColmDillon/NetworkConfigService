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
package com.networkConfigService.ServiceImpl;

import javax.ejb.EJB;

import com.networkConfigService.dao.CellDAO;
import com.networkConfigService.serviceLocal.CellServiceLocal;

public class CellServiceEJB implements CellServiceLocal {

	@EJB
	CellDAO dao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.networkConfigService.serviceLocal.CellServiceLocal#deleteCell(java
	 * .lang.Integer)
	 */
	@Override
	public void deleteCell(Integer cell_id) {
		dao.deleteCell(cell_id);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.networkConfigService.serviceLocal.CellServiceLocal#editCell(java.
	 * lang.Integer, java.lang.String, java.lang.Integer)
	 */
	@Override
	public void editCell(Integer cell_id, String cell_name, Integer cell_range) {
		dao.editCell(cell_id, cell_name, cell_range);

	}

}
