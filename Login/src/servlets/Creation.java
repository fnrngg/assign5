package servlets;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manager.Manager;

/**
 * Servlet implementation class Creation
 */
@WebServlet("/Creation")
public class Creation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Creation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Manager accounts = (Manager) getServletContext().getAttribute("Manager");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		RequestDispatcher rd;
		if(accounts.containsName(name)) {
			rd = request.getRequestDispatcher("busyName.jsp");
			rd.forward(request, response);
		} else {
			accounts.add(name, password);
			rd = request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);
		}
		
	}

}
