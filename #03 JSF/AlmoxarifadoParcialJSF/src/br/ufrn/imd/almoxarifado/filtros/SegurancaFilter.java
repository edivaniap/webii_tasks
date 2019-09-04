package br.ufrn.imd.almoxarifado.filtros;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufrn.imd.almoxarifado.dominio.Usuario;

/**
 * Servlet Filter implementation class SegurancaFilter
 */
@WebFilter("/pages/*")
public class SegurancaFilter implements Filter {
	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		Usuario usuarioLogado = (Usuario) req.getSession().getAttribute("usuarioLogado");
		
		if(usuarioLogado == null)
			res.sendRedirect("/material/index.jsf");
		else
			chain.doFilter(request, response);
	}
}
