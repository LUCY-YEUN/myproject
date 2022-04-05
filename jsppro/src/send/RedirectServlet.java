package send;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectServlet
 */
@WebServlet("/RedirectServlet")
		 // 현재 문서를 그대로 찾아옴
public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RedirectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("request", "requestValue");	// request 객체로 공유 설정(name값:value값)
		// redirect 방식으로 포워딩
		// 1. 포워딩된 페이지에서는 request 객체로 공유한 값을 사용할 수 없음(공유 범위를 벗어남)
		// 	= 포워딩된 JSP 페이지에서는 자바 서블릿 클래스에서 request 영역에 공유한 속성값에 접근할 수 없음
		// 2. 포워딩이 되면 브라우저의 URL 주소가 포워딩된 JSP 파일 명으로 변경됨
		response.sendRedirect("./servlet/ex777/redirect.jsp");
	}

}
