package ads_projeto.model.service;

import ads_projeto.model.dao.UsuarioDAO;
import ads_projeto.model.entity.Usuario;

public class UsuarioService {
	
	public boolean validar(Usuario usuario){
		UsuarioDAO dao = new UsuarioDAO();
		return dao.validar(usuario);
	}
}