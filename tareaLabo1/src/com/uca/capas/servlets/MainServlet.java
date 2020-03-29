package com.uca.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String user = request.getParameter("nombre");
		String pass = request.getParameter("pass");
		
		if ("abcd".equals(user) && "1234".equals(pass)) {
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<t1>" + "ACCESO CORRECTO" + "</t1>");
			out.println("</body>");
			out.println("</html>");
		} else {
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<t1>" + "ACCESO INCORRECTO" + "</t1>");
			out.println("</body>");
			out.println("</html>");
		}
		

        
	}


}
