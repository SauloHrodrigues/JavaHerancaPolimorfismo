package exercicio.entidades;

public class Terceirizado extends Empregado {
	
	private Double despesa;
	
	public Terceirizado() {
		super();
	}
	
		
	public Terceirizado(String nome, int qtdHorasTrabalhadas, Double vaorPorHora, Double despesa) {
		super(nome, qtdHorasTrabalhadas, vaorPorHora);
		this.despesa = despesa;
	}


	@Override
	public double valorPagamento() {
		return super.valorPagamento() + (getDespesa())*1.1;
	}


	public Double getDespesa() {
		return despesa;
	}


	public void setDespesa(Double despesa) {
		this.despesa = despesa;
	}
	
	
}
