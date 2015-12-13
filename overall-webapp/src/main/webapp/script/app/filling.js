(function(){
	"use strict";
	define(['jquery','icheck'],function($){
		var o = function(){
			var $form = $('#fillForm');
			this.render = function(){
				$form.find("section :checkbox,:radio").iCheck({
					checkboxClass:'icheckbox_square-blue',
					radioClass: 'iradio_square-blue',
					increaseArea: '20%'
				});
			};
			
			$form.show();
		};

		return new o();
	});
})();