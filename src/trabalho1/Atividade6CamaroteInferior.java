package trabalho1;

public class Atividade6CamaroteInferior extends Atividade6Vip {

	private String localizacaoIngresso;

	public Atividade6CamaroteInferior() {
		super();
	}

	public void imprimeLocalizacao() {
		System.out.println("Localização: " + localizacaoIngresso);
	}
	
	public String getLocalizacaoIngresso() {
		return localizacaoIngresso;
	}
	public void setLocalizacaoIngresso(String localizacaoIngresso) {
		this.localizacaoIngresso = localizacaoIngresso;
	}
	
}
