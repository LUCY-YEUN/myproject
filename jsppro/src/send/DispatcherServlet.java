package send;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("/DispatcherServlet")
		 // 현재 문서를 그대로 찾아옴
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispatcherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("request","requestValue");		// request 객체로 공유 설정(name값:value값)
		// dispatcher 방식으로 포워딩
		// 1. 포워딩된 페이지에서는 request 객체로 공유한 값을 사용할 수 있음
		// 2. 포워딩이 되면 브라우저의 URL 주소가 변경되지 않음
		RequestDispatcher dispatcher = request.getRequestDispatcher("./servlet/ex777/dispatcher.jsp");
		dispatcher.forward(request, response);
	}

}
