function list (){
	$.ajax({
		type:"post",
		url: "departments/list",
		success: function(response){
			$("#message").val(response);
/*			$("#departmentsTable").bootstrapTable('load',response);   usamos para prueba de la lista en la BD */
		}
	});
}