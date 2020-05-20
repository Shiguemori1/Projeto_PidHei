package ads_projeto.model.entity;

public class Projeto {
	
	private int idProjeto;
	private String tituloProjeto;
	private String temaProjeto;
	private String descricaoEsperada;
	private String descricaoMotivacao;
	private String descricaoEconomica;
	
	public int getIdProjeto() {
		return idProjeto;
	}
	public void setIdProjeto(int idProjeto) {
		this.idProjeto = idProjeto;
	}
	public String getTituloProjeto() {
		return tituloProjeto;
	}
	public void setTituloProjeto(String tituloProjeto) {
		this.tituloProjeto = tituloProjeto;
	}
	public String getTemaProjeto() {
		return temaProjeto;
	}
	public void setTemaProjeto(String temaProjeto) {
		this.temaProjeto = temaProjeto;
	}
	public String getDescricaoEsperada() {
		return descricaoEsperada;
	}
	public void setDescricaoEsperada(String descricaoEsperada) {
		this.descricaoEsperada = descricaoEsperada;
	}
	public String getDescricaoMotivacao() {
		return descricaoMotivacao;
	}
	public void setDescricaoMotivacao(String descricaoMotivacao) {
		this.descricaoMotivacao = descricaoMotivacao;
	}
	public String getDescricaoEconomica() {
		return descricaoEconomica;
	}
	public void setDescricaoEconomica(String string) {
		this.descricaoEconomica = string;
	}
	
	@Override
	public String toString() {
		return "Projeto [idProjeto=" + idProjeto + ", tituloProjeto=" + tituloProjeto + ", temaProjeto=" + temaProjeto
				+ ", descricaoEsperada=" + descricaoEsperada + ", descricaoMotivacao=" + descricaoMotivacao
				+ ", descricaoEconomica=" + descricaoEconomica + "]";
	}

}
