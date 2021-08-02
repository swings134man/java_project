<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문제풀이</title>
<link rel="stylesheet" href="css/jsQ1.css">
	<script type="text/javascript">
		
		function login() {
		id = 'root'
		pw = '1234'
		id1 = prompt('아이디 입력')
		pw1 = prompt('패스워드 입력')
		if (id1 == id && pw == pw1) {
			alert('로그인 성공')
			location.href='http://www.naver.com'
		}else {
			alert('로그인 실패')
			location.href='http://www.daum.net'			
		}
		}
	 	function price() {
			mon = '1000'
			member = prompt('1)일반, 2) vip')
			if (member == 1) {
				mon1 = parseInt(mon)*1.1 
				alert(mon1 + ' 원 입니다.')
			}else if (member == 2) {
				mon1 = parseInt(mon)*0.9 
				alert(mon1 + ' 원 입니다.')
			}else {
				alert('1,2 번중에 선택해주세요!')
			}
		} 
			
	
	</script>
</head>
<body>

<button   onclick="login()">로그인버튼</button>
<button   onclick="price()">결제버튼</button>


</body>
</html>