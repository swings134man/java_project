package webPage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Page01 extends HttpServlet{

	// Http 에 이미 있지만 아래꺼에서 오버라이드를 하고 실행하면 아래 오버라이딩 된것이 실행됨. 
	// JSP 가 서버에서 실행될 때는 자바프로그램으로 자동 코드 변경되어 실행된다. 
	// 이렇게 자동생성되는 자바코드를(프로그램) 을 서블릿이라고 부른다. 
	// servlet : server + let(릿, 작은프로그램)
	// JSP -->> servlet : Tomcat내의 JSP 엔진(서블릿 엔진)
	// JSP 내에 작성한 모든 자바코드는 service() 메서드 안으로 들어가서 자동 생성.
	// JSP 내에 선언된 변수는 모두 지역변수이다. 초기화를 반드시 해줘야 한다.  <==> 왜냐면 메서드안에 들어가있으니까 지역변수임. 
	// 전역변수를 선언해서 사용하고자 하는 경우는 <%! %> 전역변수 선언시 사용. 
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		
		super.service(req, resp);
	}
	
	
	
	
}
