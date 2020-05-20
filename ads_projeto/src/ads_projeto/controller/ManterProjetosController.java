package ads_projeto.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.NoSuchElementException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ads_projeto.model.entity.Projeto;
import ads_projeto.model.service.ProjetoService;

@WebServlet("/manter_projetos.do")
public class ManterProjetosController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String acao = request.getParameter("acao");
		Projeto projeto = null;
		ProjetoService fService = new ProjetoService();
		String saida = "index.jsp";
		String id_projeto = null;
		int idProjeto = -1;
		String tituloProjeto = null;
		String temaProjeto = null;
		String descricaoEsperada = null;
		String descricaoMotivacao = null;
		String descricaoEconomica = null;
		Enumeration<String> pars = null;
		String par = null;
		ArrayList<Integer> listaIds = null;
		String[] vals = null;
		ArrayList<Projeto> projetos = null;

		switch (acao) {
		case "btn-visualizar-de-listar-projetos-jsp":
			pars = request.getParameterNames();
			listaIds = new ArrayList<>();
			try {
				while ((par = pars.nextElement()) != null) {
					if (par.startsWith("box")) {
						System.out.println(par + " = " + Arrays.toString(request.getParameterValues(par)));
						vals = request.getParameterValues(par);
						if (vals != null && vals.length > 0 && vals[0].equals("on")) {
							listaIds.add(Integer.parseInt(par.substring(3)));
						}
					}
				}
			} catch (NoSuchElementException nsee) {
			}
			System.out.println("Editar listaIds = " + listaIds);
		case "btn-mostrar-de-mostrar-projetos-jsp":
			id_projeto = request.getParameter("id_projeto");
			if (id_projeto != null) {
				idProjeto = Integer.parseInt(id_projeto);
			} else {
				if (listaIds != null && listaIds.size() > 0) {
					idProjeto = listaIds.get(0);
				} else {
					idProjeto = -1;
				}

			}
			projeto = fService.buscarProjeto(idProjeto);
			System.out.println(projeto);
			request.setAttribute("projeto", projeto);
			//verificar a saída
			saida = "Filme.jsp";
			break;
		case "btn-inserir-de-inserir-projeto-jsp":
			tituloProjeto = request.getParameter("tituloprojeto");
			temaProjeto = request.getParameter("descricaoprojeto");
			descricaoEsperada = request.getParameter("descricaoesperada");
			descricaoMotivacao = request.getParameter("descricaomotivacao");
			descricaoEconomica = request.getParameter("descricaoeconomica");
			projeto = new Projeto();
			projeto.setTituloProjeto(tituloProjeto);
			projeto.setDescricaoEsperada(descricaoEsperada);
			projeto.setDescricaoMotivacao(descricaoMotivacao);
			projeto.setDescricaoEconomica(descricaoEconomica);
			int id = fService.inserirFilme(projeto);
			projeto.setIdProjeto(idProjeto);
			System.out.println(projeto);
			request.setAttribute("projeto", projeto);
			saida = "Projeto.jsp";
			break;
		case "btn-editar-de-listar-projetos-jsp":
			pars = request.getParameterNames();
			listaIds = new ArrayList<>();
			try {
				while ((par = pars.nextElement()) != null) {
					if (par.startsWith("box")) {
						System.out.println(par + " = " + Arrays.toString(request.getParameterValues(par)));
						vals = request.getParameterValues(par);
						if (vals != null && vals.length > 0 && vals[0].equals("on")) {
							listaIds.add(Integer.parseInt(par.substring(3)));
						}
					}
				}
			} catch (NoSuchElementException nsee) {
			}
			System.out.println("Editar listaIds = " + listaIds);
		case "btn-editar-de-projeto-jsp":
			id_projeto = request.getParameter("id_projeto");
			if (id_projeto != null) {
				idProjeto = Integer.parseInt(id_projeto);
			} else {
				if (listaIds != null && listaIds.size() > 0) {
					idProjeto = listaIds.get(0);
				} else {
					idProjeto = -1;
				}

			}
			projeto = fService.buscarProjeto(idProjeto);
			request.setAttribute("projeto", projeto);
			System.out.println(projeto);
			saida = "AtualizarProjeto.jsp";
			break;
		case "btn-atualizar-de-atualizar-filme-jsp":
			id_projeto = request.getParameter("id_projeto");
			idProjeto = Integer.parseInt(id_projeto);
			tituloProjeto = request.getParameter("tituloprojeto");
			temaProjeto = request.getParameter("temaprojeto");
			descricaoEsperada = request.getParameter("descricaoesperada");
			descricaoMotivacao = request.getParameter("descricaomotivacao");
			descricaoEconomica = request.getParameter("descricaoeconomica");
			projeto = new Projeto();
			projeto.setIdProjeto(idProjeto);
			projeto.setTituloProjeto(tituloProjeto);
			projeto.setTemaProjeto(temaProjeto);
			projeto.setDescricaoEsperada(descricaoEsperada);
			projeto.setDescricaoMotivacao(descricaoMotivacao);
			projeto.setDescricaoEconomica(descricaoEconomica);
			System.out.println(projeto);
			fService.atualizarFilme(projeto);
			request.setAttribute("projeto", projeto);
			//verificar saída
			saida = "Projeto.jsp";
			break;
		case "btn-excluir-de-modal-listar-projetos-jsp":
			pars = request.getParameterNames();
			listaIds = new ArrayList<>();
			projetos = new ArrayList<>();
			try {
				while ((par = pars.nextElement()) != null) {
					if (par.startsWith("box")) {
						System.out.println(par + " = " + Arrays.toString(request.getParameterValues(par)));
						vals = request.getParameterValues(par);
						if (vals != null && vals.length > 0 && vals[0].equals("on")) {
							listaIds.add(Integer.parseInt(par.substring(3)));
						}
					}
				}
			} catch (NoSuchElementException nsee) {
			}
			System.out.println("Excluir listaIds = " + listaIds);
			for (int idDel : listaIds) {
				try {
					projeto = fService.excluirProjeto(idDel);
					projetos.add(projeto);
					System.out.println(projeto);
				} catch (NumberFormatException nfe) {
					nfe.printStackTrace();
					projeto = null;
				}
			}
			request.setAttribute("projetos", projetos);
			saida = "ProjetoExcluido.jsp";
			break;
		case "btn-excluir-de-projeto-jsp":
			id_projeto = request.getParameter("id_projeto");
			try {
				idProjeto = Integer.parseInt(id_projeto);
				projeto = fService.excluirProjeto(idProjeto);
				System.out.println(projeto);
			} catch (NumberFormatException nfe) {
				nfe.printStackTrace();
				projeto = null;
			}
			projetos = new ArrayList<>();
			projetos.add(projeto);
			request.setAttribute("projetos", projetos);
			//criar uma página de projetos excluídos
			saida = "ProjetoExcluido.jsp";
			break;
			/*
		case "menu-listar-menu-jsp":
			projeto = fService.listarProjeto();
			request.setAttribute("projetos", projetos);
			//verificar a saída
			saida = "ListaFilmes.jsp";
			break;
			*/
		}
		RequestDispatcher view = request.getRequestDispatcher(saida);
		view.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
