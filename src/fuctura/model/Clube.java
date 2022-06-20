package fuctura.model;

public class Clube implements Entidade {
	private String nome;
	private int capacidade;
	private String dtFundacao;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public String getDtFundacao() {
		return dtFundacao;
	}
	public void setDtFundacao(String dtFundacao) {
		this.dtFundacao = dtFundacao;
	}
	
	

}
