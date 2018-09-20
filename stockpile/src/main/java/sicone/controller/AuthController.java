package sicone.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sicone.model.UserInfo;

@WebServlet("/Auth")
public class AuthController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AuthController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user = request.getParameter("TXTUSER");
		String pass = request.getParameter("TXTPASS");
		String msg = null;

		HttpSession session = request.getSession();

		try {
			if ("funcionario".equals(user) && "".equals(pass)) {
				UserInfo userInfo = new UserInfo();
				userInfo.setProfile("funcionario");
				userInfo.setNome("Jonas da Bigorna");
				userInfo.setLogado(true);
				session.setAttribute("LOGADO", userInfo);

				response.sendRedirect("/stockpile.jsp");

			} else if ("admin".equals(user) && "".equals(pass)) {
				UserInfo userInfo = new UserInfo();
				userInfo.setProfile("admin");
				userInfo.setNome("Admin");
				userInfo.setLogado(true);
				session.setAttribute("LOGADO", userInfo);

				response.sendRedirect("/admin-func.jsp");

			} else {
				msg = "Usu�rio ou senha incorretos.";
				session.setAttribute("MENSAGEM", msg);
				session.setAttribute("LOGADO", null);

				response.sendRedirect("/index.jsp");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
