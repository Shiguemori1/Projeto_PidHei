package ads_projeto.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.NoSuchElementException;

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
	
	public ArrayList<Integer> obterIds(){
		Enumeration<String> pars = request.getParameterNames();
		ArrayList<Integer> listaIds = new ArrayList<>();
		String par;
		String[] vals = null;
		
		try {
			while ((par = pars.nextElement()) != null) {
				if (par.startsWith("box")) {
					System.out.println(par +" = "+Arrays.toString(request.getParameterValues(par)));
					vals = request.getParameterValues(par);
					if (vals != null && vals.length > 0 && vals[0].equals("on")) {
						listaIds.add(Integer.parseInt(par.substring(3)));
					}
				}
			}
		} catch(NoSuchElementException nsee) {
		}
		return listaIds;
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






