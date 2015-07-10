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
package com.networkConfigService.REST;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import com.networkConfigService.serviceLocal.CellServiceLocal;

@Path("/cell")
public class CellREST {

	@Inject
	CellServiceLocal cellService;

	@POST
	@Path("/delete_cell")
	public Response deleteCell(@FormParam("cell_id") Integer cell_id) {
		cellService.deleteCell(cell_id);
		return Response.status(200).build();
	}

	@POST
	@Path("/edit_cell")
	public Response editCell(@FormParam("cell_id") Integer cell_id,
			@FormParam("cell_name") String cell_name,
			@FormParam("cell_range") Integer cell_range) {
		cellService.editCell(cell_id, cell_name, cell_range);
		return Response.status(200).build();
	}

	@POST
	@Path("create_cell")
	public Response createCell(@FormParam("cell_id") Integer cell_id,
			@FormParam("cell_name") String cell_name,
			@FormParam("cell_range") Integer cell_range) {
		cellService.createCell(cell_id, cell_name, cell_range);
		return Response.status(200).build();
	}

}
