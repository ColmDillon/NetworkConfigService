

function create_node(){
	
	var nodeId = $("#nodeId").val();
	var nodeName = $("#nodeName").val();
	var nodeLocation = $("#nodeLocation").val();
	var latitude = $("#latitude").val();
	var longtitude = $("#longtitude").val();
	
	
	
	$.ajax({
		  type: 'POST',
		  url: "rest/network/addNode?nodeId=" + nodeId + "&nodeName=" + nodeName + "&nodeLocation=" + nodeLocation + "&latitude=" + latitude + "&longtitude=" + longtitude,
		  success: alert("node successfully created"),
		  contentType: 'application/json'
	});
	
}
	
