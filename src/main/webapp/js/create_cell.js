function createCell {
	var cell_id = document.getElementById("input_cellid").value;
	var cell_name = document.getElementById("input_cellname").value;
	var cell_range = document.getElementById("input_cellrange").value;
	alert("In create cell");
	$.ajax({
		type : 'POST',
		url : "http://localhost:8080/TrackBackup/rest/cell/create_cell",
		dataType : "json",
		data : {
			"cell_id" : cell_id,
			"cell_name" : cell_name,
			"cell_range" : cell_range,
 		},
		success : function(response) {
			$.each(response, function(i, item) {
				document.write("Cell created")
			})
		}
	});
	
	
}