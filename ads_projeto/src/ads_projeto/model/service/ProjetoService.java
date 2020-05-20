package ads_projeto.model.service;

import java.io.IOException;
import java.util.ArrayList;

import ads_projeto.model.dao.ProjetoDAO;
import ads_projeto.model.entity.Projeto;




public class ProjetoService {
	ProjetoDAO dao;
	
	public ProjetoService() {
		this.dao = new ProjetoDAO();
	}

	public int inserirFilme(Projeto projeto) throws IOException {
		return dao.inserirProjeto(projeto);
	}

	public Projeto buscarProjeto(int idProjeto) throws IOException {
		return dao.buscarProjeto(idProjeto);
	}
	
	public Projeto excluirProjeto(int idProjeto) throws IOException {
		Projeto projeto = dao.buscarProjeto(idProjeto);
		if (projeto != null) {
			dao.excluirProjeto(projeto.getIdProjeto());
			return projeto;
		} else {
			return null;
		}
	}
	
	public ArrayList<Projeto> listarProjeto() throws IOException {
		return dao.listarProjeto();
	}
	
	public ArrayList<Projeto> listarFilmes(ArrayList<Integer> lista) throws IOException {
		ArrayList<Projeto> projetos = new ArrayList<>();
		for(int idProjeto:lista) {
			projetos.add(buscarProjeto(idProjeto));
		}
		return projetos;
	}

	public void atualizarFilme(Projeto projeto) throws IOException {
		dao.atualizarFilme(projeto);
	}
}
