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