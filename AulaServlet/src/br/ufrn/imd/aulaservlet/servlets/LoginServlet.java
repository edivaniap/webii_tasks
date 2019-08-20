package br.ufrn.imd.aulaservlet.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufrn.imd.aulaservlet.dominio.Usuario;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/logar")
public class LoginServlet extends HttpServlet {       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeUsuario = request.getParameter("nomeUsuario");
		String senha = request.getParameter("senha");
		
		if(nomeUsuario.equals("edivania") && senha.equals("epo")) {
			Usuario usuario = new Usuario("Edivania Pontes", "edivania", "epo");
			
			request.getSession().setAttribute("usuario", usuario);
			response.sendRedirect("/AulaServlet/paginas/conteudo.jsp");
		} else {
			response.sendRedirect("/AulaServlet/login.jsp");
		}
	}
	
}
