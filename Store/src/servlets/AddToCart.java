package servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.Cart;

/**
 * Servlet implementation class AddToCart
 */
@WebServlet("/AddToCart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToCart() {
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
		String[] counts = request.getParameterValues("count");
		String[] ids = request.getParameterValues("id");
		RequestDispatcher rd;
		Cart cart = (Cart) request.getSession().getAttribute("cart");
		for (int i = 0; i < ids.length; i++) {
			int count;
			try {
				count = Integer.parseInt(counts[i]);
			} catch (NumberFormatException e) {
				count = 0;
			}
			String id = ids[i];
			if(count != 0) {
				cart.addItem(id, count);
			} else {
				cart.remove(id);
			}
		}
		rd = request.getRequestDispatcher("cart.jsp");
		rd.forward(request, response);
	}

}
