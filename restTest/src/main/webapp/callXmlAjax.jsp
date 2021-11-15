<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>xml</title>
</head>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
$(function(){
	
	$('#b1').click(function() {
		$.ajax({
			url: "resources/text/rank.xml",
			success: function(xmlResult) {
				alert(xmlResult)
				list = $(xmlResult).find('rank')
				alert(list.length + "개 ")
				
				/* for (var i = 0; i < list.length; i++) {
					console.log($(list[i]).find('name').text())
					console.log($(list[i]).find('tel').text())
				}//for */
				 $(list).each(function(i, x) {
					//console.log($(x).find('name').text())
					//console.log($(x).find('tel').text())
					na = $(x).find('name').text()
					tel = $(x).find('tel').text()
					
					$.ajax({
						url: "dbGO",
						data: {
							name: na,
							tel: tel
						},
						success: function() {
							console.log("insert 성공")
						}//success
					})//2nd ajax
				})//func  아래와 똑같은 코드임 
				
				
				/* $(list).each(function() {
					// 파라메터를 쓰지 않으면. $(this) 사용.
					/* console.log($(this).find('name').text())
					console.log($(this).find('tel').text()) */
					
					//$('div').append($(this).find('name').text() + ": " + $(this).find('tel').text() + "<br>")
					
				//})//each */
				
			}//success
		})//ajax
	}) //b1 button
	
	$('#b2').click(function() {
		$.ajax({
			url: "jsonResponse2",
			success: function(jsonList) {
			//	alert(jsonList.length)
			console.log(jsonList)
			$(jsonList).each(function(index, json) {
				 one = json.id + ", " + json.name + ", " + json.url + ", " + "<img src=" + json.img + " width=100 height=100>" + "<br>"
				 $('div').append(index + ": " + one)
			})//each
			}//success
		})//ajax
	}) //b2 button
	
	
})//function
</script>
<body>

<button id="b1" style="color: yellow;">bag Json</button>
<button id="b2" style="color: green;">bagList Json</button>
<hr color="red">

<div style="background: yellow; color: blue; font-size: 20px;">



</div>
</body>
</html>