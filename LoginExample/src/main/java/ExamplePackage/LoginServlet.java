package ExamplePackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {

		try {

			UserBean user = new UserBean();
			user.setUserName(request.getParameter("un"));
			user.setPassword(request.getParameter("pw"));

			user = UserDAO.login(user);

			if (user.isValid()) {

				HttpSession session = request.getSession(true);
				session.setAttribute("currentSessionUser", user);
				response.sendRedirect("userLogged.jsp"); // logged-in page

			}

			else
				response.sendRedirect("invalidLogin.jsp"); // error page
		}

		catch (Throwable theException) {
			System.out.println(theException);
		}
	}
}
