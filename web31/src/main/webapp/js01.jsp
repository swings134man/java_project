<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>js01</title>
<script type="text/javascript">
		//alert("tern project")
	function idCheck() {
		//1. id에 입력한 값 가지고 와야함. 
		//1-1. id가 "id"인 input 태그를 먼저 찾아야함.
		idTag = document.getElementById("id");
		//1-2. 그 태그내에 있는 value값을 가지고 오면 됨. 
		idValue = idTag.value; // value ="test"
		alert('id is >> '  + idValue);
		//2. 값에 글자수를 세야함.
		alert('id 길이 >> '  + idValue.length);
		//3. 5글자 이상이 아닌 경우, 메시지를 보여주어야 함.
		result = "";
		if (idValue.length >= 5) {
			result = "5글자 이상입니다. 유효합니다."
		}else {
			result = "5글자 미만입니다. 재입력해주세요."
		}
		divTag = document.getElementById("result");	//div 태그 인식
		divTag.innerHTML = result;					// div 안에 스트링값을 넣어주겠다는것. <div>여기에 넣어줌</div>
	}// id func end
		
		function pwCheck() {
			pwTag = document.getElementById("pw1");
			pwTag2 = document.getElementById("pw2");
			
			pwValue = pwTag.value;
			pwValue2 = pwTag2.value;
			
			result = "비밀번호가 불일치합니다!<img src=img/no.jpeg>"; 
			if (pwValue == pwValue2) {
				result = "비밀번호가 일치합니다!<img src=img/ok.jpeg>";
			} 
		divTag = document.getElementById("result");
		divTag.innerHTML = result;
		pwTag.value = "";
		pwTag2.value = "";
		} //pw func end 
		
		
</script>
</head>
<body>
<h2>자바 스크립트 테스트</h2>
<hr>
	아이디: <input name="id" id="id" value="test"> <button onclick="idCheck()" id="b1">글자수 체크</button> <br>
	패스워드: <input name="pw1" id="pw1"> <br>
	패스워드2: <input name="pw2" id="pw2">  <button onclick="pwCheck()" id="b2">패스워드 동일여부 체크</button>
<hr>
<div id="result" style="color:red; background: yellow; width: 500px; height: 50px; font-size: 30px;"></div>
</body>
</html>