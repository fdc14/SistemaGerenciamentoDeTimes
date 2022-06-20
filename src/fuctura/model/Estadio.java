package fuctura.model;

public class Estadio implements Entidade {
	
	private String nome;
	private String apelido;
	private String dtConstrucao;
	private String dtInauguracao;
	private int capacidade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getDtConstrucao() {
		return dtConstrucao;
	}
	public void setDtConstrucao(String dtConstrucao) {
		this.dtConstrucao = dtConstrucao;
	}
	public String getDtInauguracao() {
		return dtInauguracao;
	}
	public void setDtInauguracao(String dtInauguracao) {
		this.dtInauguracao = dtInauguracao;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	

}
