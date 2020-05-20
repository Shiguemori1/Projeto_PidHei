package ads_projeto.model.entity;

public class Colaborador {
	
	private int idColaborador;
	private String nomeColaborador;
	private String sobrenomeColaborador;
	private String emailColaborador;
	private String cpfColaborador;
	
	public int getIdColaborador() {
		return idColaborador;
	}
	public void setIdColaborador(int idColaborador) {
		this.idColaborador = idColaborador;
	}
	public String getNomeColaborador() {
		return nomeColaborador;
	}
	public void setNomeColaborador(String nomeColaborador) {
		this.nomeColaborador = nomeColaborador;
	}
	public String getSobrenomeColaborador() {
		return sobrenomeColaborador;
	}
	public void setSobrenomeColaborador(String sobrenomeColaborador) {
		this.sobrenomeColaborador = sobrenomeColaborador;
	}
	public String getEmailColaborador() {
		return emailColaborador;
	}
	public void setEmailColaborador(String emailColaborador) {
		this.emailColaborador = emailColaborador;
	}
	public String getCpfColaborador() {
		return cpfColaborador;
	}
	public void setCpfColaborador(String cpfColaborador) {
		this.cpfColaborador = cpfColaborador;
	}
	
	@Override
	public String toString() {
		return "Colaborador [idColaborador=" + idColaborador + ", nomeColaborador=" + nomeColaborador
				+ ", sobrenomeColaborador=" + sobrenomeColaborador + ", emailColaborador=" + emailColaborador
				+ ", cpfColaborador=" + cpfColaborador + "]";
	}
	
}
