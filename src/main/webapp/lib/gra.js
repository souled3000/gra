$(function() {
	// _menu initialing
	$('#_menu').children().click(function(event) {
		// alert(this.id);
		$('#_content').load(basePath + '/' + this.id, function(responseTxt, statusTxt, xhr) {
			// alert("Error: " + xhr.status + ": " + xhr.statusText + ":" +
			// responseTxt + ":" + statusTxt);
		});
	});
	$('#current').click();
});

function goto(n){
	$('#_content').load(basePath + '/current?curPageNo='+n, function(responseTxt, statusTxt, xhr) {
		// alert("Error: " + xhr.status + ": " + xhr.statusText + ":" +
		// responseTxt + ":" + statusTxt);
	});
}
function gotohis(n){
	$('#_content').load(basePath + '/his?pageNo='+n, function(responseTxt, statusTxt, xhr) {
		// alert("Error: " + xhr.status + ": " + xhr.statusText + ":" +
		// responseTxt + ":" + statusTxt);
	});
}


function signout(n,pageNo){
	$('#_content').load(basePath + '/signout?id='+n+'&curPageNo='+pageNo, function(responseTxt, statusTxt, xhr) {
		// alert("Error: " + xhr.status + ": " + xhr.statusText + ":" +
		// responseTxt + ":" + statusTxt);
	});
}

function signin(){
//	 var fields = $('#signinform').serializeArray();
//     var obj = {}; // 声明一个对象
//     $.each(fields, function(index, field) {
//         obj[field.name] = field.value; // 通过变量，将属性值，属性一起放到对象中
//     })
	$.post(basePath + "/signin",$('#signinform').serialize(),function(result,status){
		$('#_content').html(result);
	});
		
}