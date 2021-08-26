<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		
		// id 체크 버튼
		$('#bt1').click(function() {
			ch = $('#id').val();
			if (ch == "" || ch.length < 0) {
				alert('아이디를 입력해주세요.');
			}else if (ch != "" || ch.length<4 || ch.length > 12 ) {
				alert('아이디는 4~12자 입력가능합니다.');
			}else{
				// DB에 보내서 중복체크 해야함. ajax? 
				
				
			}//else
		})//click
	}) //func

	// 취소 버튼 메서드
	function cancelCheck() {
		location.href = "http://localhost:8889/pro2/main.jsp"
	};


	

</script>
<!-- 회원가입 유효성체크 -->
<script type="text/javascript">
	function submitCheck() {
		if ($('#mail').val() == "") {
			alert('Email 확인');
			$('#mail').focus();
			return false;
		};
		if ($('#id').val() == "") {
			alert('id 확인');
			$('#id').focus();
			return false;
		};
		//패스워드 공백 & 두개가 같은지 
		if ($('#pw').val() == "" ) {
			alert('패스워드 확인');
			$('#pw').focus();
			return false;
		};
		if ($('#pw').val() !== $('#pw1').val()) {
			alert('패스워드가 다릅니다!');
			$('#pw1').focus();
			errorPw1.innerHTML = '비밀번호가 틀렸습니다.';
			return false;
		};
		if ($('#name1').val() == "") {
			alert('이름 확인');
			$('#name1').focus();
			return false;
		};
		if ($('#tel').val() == "") {
			alert('핸드폰 번호 확인');
			$('#tel').focus();
			return false;
		};
		
		
		
		
		
		
		
		
		
		
		
	
	};//func

</script>

</head>
<body>
<form action="loginCheck.jsp" name="form1" id="form1" onsubmit= "return submitCheck();">
	이메일* <br>
		<input type="text" name="E_Mail" id="mail" placeholder="사용가능한 이메일을 입력하세요."  > <br>
		<div id="error" style="color: red;"></div>
	아이디*<br>
		<input type="text" name="id" id="id">
		<div id="errorId" style="color: red;"></div>
		<!-- 중복체크 버튼 -->
		<input type="button" id="bt1" name="bt1"  value="중복체크"> <br>
		
	비밀번호* <br>
		<input type="text" name="pw" id="pw"> <br>
		<div id="errorPw" style="color: red;"></div>
	비밀번호 확인* <br>
		<input type="text" name="pw1" id="pw1"> <br>
		<div id="errorPw1" style="color: red;"></div>	
		
	이름* <br>
		<input type="text" name="name1" id="name1" placeholder="한글 이름을 입력하세요."> <br>
		<div id="errorNa" style="color: red;"></div>
	영문이름
	성(First Name)    이름(Last Name) <br>
	<input type="text" name="E_NameF" id="E_NameF">  <input type="text" name="E_NameL" id="E_NameL"> <br>	
		
	성별 <br>
		<label> <input type="radio" name="gender" value="man">남성</label> 
		<label> <input type="radio" name="gender" value="woman">여성</label> <br>
	생일 <br>
		<input type="text" name="birth"> <br>
	핸드폰 번호* <br>
				<!-- phone1,2,3 더한게 phone 임  -->
		<select name="phone1" id="tel">
			<option value="010" selected >010</option>		
		<option value="011">011</option>
		<option value="012">012</option>
		<option value="016">016</option>
		</select>
		<input type="text" name="phone2" id="tel" maxlength="4" > - 
		<input type="text" name="phone3" id="tel" maxlength="4"> <br>
	국가 <br>
		<select id="country" name="country">
		<option>=====국가=====</option>
		<option value="대한민국">대한민국</option>
		<option value="미국">미국</option>
		<option value="일본">일본</option>
		<option value="중국">중국</option>
		<option value="호주">호주</option>
	</select> <br>
	<button type="button" id="cancel" onclick="cancelCheck()" >취소</button> <button id="submit" >회원가입</button>
</form>
	<!-- 공백체크  -->
<script type="text/javascript">
	/* 공백 체크 & 올바른값 체크 */
	// 이메일
	mail.onblur = function() {
		if (mail.value == "") {
			mail.classList.add('invalid');
			error.innerHTML = "필수항목 입니다.";
		}else if (!mail.value.includes('@')) {
			mail.classList.add('invalid');
			error.innerHTML = "올바른 이메일 주소를 입력하세요.";
		};
	};
	mail.onfocus = function() {
		if (this.classList.contains('invalid')) {
			this.classList.remove('invalid');
			error.innerHTML = "";
		}
	};
	//아이디
	id.onblur = function() {
		if (id.value == "") {
			id.classList.add('invalidId');
			errorId.innerHTML = '필수항목 입니다.';
		};
	}
	id.onfocus = function() {
		if (this.classList.contains('invalidId')) {
			this.classList.remove('invalidId');
			errorId.innerHTML = "";
	};
	};
	//비밀번호
	pw.onblur = function() {
		if (pw.value == "") {
			pw.classList.add('invalidPw');
			errorPw.innerHTML = '필수항목 입니다.';
		};
	}
	pw.onfocus = function() {
		if (this.classList.contains('invalidPw')) {
			this.classList.remove('invalidPw');
			errorPw.innerHTML = "";
	};
	};
	pw1.onblur = function() {
		if (pw1.value == "") {
			pw1.classList.add('invalidPw1');
			errorPw1.innerHTML = '필수항목 입니다.';
		};
	}
	pw1.onfocus = function() {
		if (this.classList.contains('invalidPw1')) {
			this.classList.remove('invalidPw1');
			errorPw1.innerHTML = "";
	};
	};
	//이름
	name1.onblur = function() {
		if (name1.value == "") {
			name1.classList.add('invalidName');
			errorNa.innerHTML = '필수항목 입니다.';
		};
	}
	name1.onfocus = function() {
		if (this.classList.contains('invalidName')) {
			this.classList.remove('invalidName');
			errorNa.innerHTML = "";
	};
	};
</script>

</body>
</html>