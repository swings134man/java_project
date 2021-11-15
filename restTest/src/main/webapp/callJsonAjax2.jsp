<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax</title>
</head>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
$(function(){
	
	$('#b1').click(function() {
		$.ajax({
			url: "jsonResponse1",
			success: function(json) {
				//alert(json)
				$('div').append("id- " + json.id + "<br>")
				$('div').append("url- " + json.url + "<br>")
				$('div').append("name- " + json.name + "<br>")
				$('div').append("img- " + json.img + "<br>")
				
				imgSrc = "<img src=" + json.img + ">"
				urlGo = "<a href=" + json.name + ">" + json.url + "</a>"

					$('div').append(urlGo + "<br>")
					$('div').append(imgSrc + "<br>")
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
<div>



</div>
</body>
</html>