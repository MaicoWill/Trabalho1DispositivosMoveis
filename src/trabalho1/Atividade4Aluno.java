package trabalho1;

public class Atividade4Aluno {

	private String nome;
	private double nota1;
	private double nota2;
	
	public Atividade4Aluno() {
		super();
	}

	public Atividade4Aluno(String nome, double nota1, double nota2) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public double calcularMedia(double nota1, double nota2) {
		return (nota1 + nota2) / 2;
	}
	
	public String situacao(double media) {
		
		if (media < 4)
			return "reprovado";
		else if (media >= 4 && media < 7)
			return "final";
		else
			return "aprovado";
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

}
