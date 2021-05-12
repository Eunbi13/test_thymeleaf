/**
 * 
 */
$('.pager').click(function(){
	let num = $(this).attr('title');
	$('#curPage').val(num);
	$('#frm').submit();
	
});