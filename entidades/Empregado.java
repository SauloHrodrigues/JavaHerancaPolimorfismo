package exercicio.entidades;

public class Empregado {
	private String nome;
	private int qtdHorasTrabalhadas;
	private Double vaorPorHora;
	
	public Empregado() {
		
	}

	public Empregado(String nome, int qtdHorasTrabalhadas, Double vaorPorHora) {
		this.nome = nome;
		this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
		this.vaorPorHora = vaorPorHora;
	}
	
	public double valorPagamento() {
		return getQtdHorasTrabalhadas() * getVaorPorHora();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdHorasTrabalhadas() {
		return qtdHorasTrabalhadas;
	}

	public void setQtdHorasTrabalhadas(int qtdHorasTrabalhadas) {
		this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
	}

	public Double getVaorPorHora() {
		return vaorPorHora;
	}

	public void setVaorPorHora(Double vaorPorHora) {
		this.vaorPorHora = vaorPorHora;
	}
	
	
	
	
	
}
