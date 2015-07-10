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
package com.networkConfigService.dao;

import javax.ejb.Local;

import com.networkConfigService.entities.Cell;

// checking git
@Local
public interface CellDAO {
	Cell getCell(Integer cell_id);

	void deleteCell(Integer cell_id);

	void editCell(Integer cell_id, String cell_name, Integer cell_range);

	void createCell(Integer cell_id, String cell_name, Integer cell_range);
}
