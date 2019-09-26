package trabalho1;

public class Atividade6 {

	public static void main(String[] args) {

		Atividade6Normal normal = new Atividade6Normal();
		Atividade6CamaroteSuperior camaroteSuperior = new Atividade6CamaroteSuperior();
		Atividade6CamaroteInferior camaroteInferior = new Atividade6CamaroteInferior();
		
		System.out.println("Ingresso normal: " + normal.getValorReais());		
		System.out.println("Ingresso vip camarote inferior: " + camaroteInferior.valorVip());		
		System.out.println("Ingresso vip camarote superior: " + camaroteSuperior.valorIngresso());		
		
	}

}
