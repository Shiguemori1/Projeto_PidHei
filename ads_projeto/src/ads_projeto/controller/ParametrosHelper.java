package ads_projeto.controller;

import javax.servlet.http.HttpServletRequest;

import ads_projeto.model.entity.Usuario;

public class ParametrosHelper {
	private HttpServletRequest request;

	public ParametrosHelper(HttpServletRequest request) {
		this.request = request;
	}

	public String getAcao() {
		String acao = request.getParameter("acao");
		if (acao == null) {
			return "desconhecida";
		} else {
			return acao;
		}
	}

	public Usuario getUsuario() {
		Usuario usuario = new Usuario();
		String username = request.getParameter("username");
		String password = request.getParameter("passwd");
		usuario.setUsername(username);
		usuario.setPassword(password);
		return usuario;
	}
}
