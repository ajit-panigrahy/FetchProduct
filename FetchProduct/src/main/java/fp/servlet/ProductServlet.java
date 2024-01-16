package fp.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fp.entity.Product;

@WebServlet("/processForm")
public class ProductServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		String productName = request.getParameter("productName");
		double productPrice = Double
				.parseDouble(request.getParameter("productPrice"));
		int productStockQuantity = Integer
				.parseInt(request.getParameter("stockQuantity"));

		Product product = new Product(productName, productPrice,
				productStockQuantity);

		HttpSession session = request.getSession();
		session.setAttribute("product", product);

		response.sendRedirect("displayProduct.jsp");
	}
}
