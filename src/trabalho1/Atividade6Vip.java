package trabalho1;

public class Atividade6Vip extends Atividade6Ingresso {

	private double valorAdicional;

	public Atividade6Vip() {
		super();
		valorAdicional = 10;
	}

	public double valorVip() {
		return getValorReais() + valorAdicional;
	}
	
	public double getValorAdicional() {
		return valorAdicional;
	}
	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
}
