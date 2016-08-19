$.editable.addInputType('password', {
	element:function(settings,original) {
		var input=$('<input type="password">');
		if(settings.width!='none') {
			input.width(settings.width);
		}
		if(settings.height!='none') {
			input.height(settings.height);
		}
		input.attr('autocomplete','off');
		$(this).append(input);
		return(input);
	}
});