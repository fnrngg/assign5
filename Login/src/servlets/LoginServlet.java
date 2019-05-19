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
 * Servlet implementation class HandleLogin
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Manager accounts = (Manager)getServletContext().getAttribute("Manager");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		RequestDispatcher rd;
		if(accounts.containsUser(name, password)) {
			rd = request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);
		} else {
			rd = request.getRequestDispatcher("failed.jsp");
			rd.forward(request, response);
		}
		
	}

}
