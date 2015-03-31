package com.nb.simpleweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(name="SimpleServlet", urlPatterns={"/simple.do"})
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try{
			out.println("<html>");
			out.println("<head>");
			out.println("<title> " + request.getServletPath() + "</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>" +  request.getServletPath() + "</h1>");
			out.println("</body>");
			out.println("</html>");
		}finally{
			out.close();
		}
	}

}
