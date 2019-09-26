package trabalho1;

public class Atividade6CamaroteSuperior extends Atividade6Vip {

	private double valorAdicional;

	public Atividade6CamaroteSuperior() {
		super();
		valorAdicional = 5;
	}

	public double valorIngresso() {
		return super.getValorAdicional() + super.getValorReais() + valorAdicional;
	}
	
	public double getValorAdicional() {
		return valorAdicional;
	}
	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
}
