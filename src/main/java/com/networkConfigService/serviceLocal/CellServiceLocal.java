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
package com.networkConfigService.serviceLocal;

public interface CellServiceLocal {
	public void deleteCell(Integer cell_id);

	public void editCell(Integer cell_id, String cell_name, Integer cell_range);

	public void createCell(Integer cell_id, String cell_name, Integer cell_range);
}
