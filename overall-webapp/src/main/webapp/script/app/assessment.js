(function(){
	"use strict";
	define(['jquery','icheck'],function($){
		var o = function(){
			var $form = $('#fillForm');
			var a = 1;
			$form.find('.form-group >.col-radio').each(function(i,n){
				$(this).find(':radio').each(function(j,m){
					$(this).attr('name','item'+a);
				});
				
				a++;
			});
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