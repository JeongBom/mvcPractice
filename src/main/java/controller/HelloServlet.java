//package controller;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet("/hello")
//public class HelloServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//  
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//	        throws ServletException, IOException {
//	    process(request, response);
//	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//	        throws ServletException, IOException {
//	    process(request, response);
//	}
//
//	private void process(HttpServletRequest request, HttpServletResponse response)
//	        throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
//	    String name = request.getParameter("name");
//	    HelloDao dao = new HelloDao();
//        boolean isMember = dao.isMember(name);
//
//        String message = isMember ? name + "님은 등록된 회원입니다." : name + "님은 회원이 아닙니다.";
//
//        request.setAttribute("message", message);
//        request.getRequestDispatcher("result.jsp").forward(request, response);
//
//}
//}
