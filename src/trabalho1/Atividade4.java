package trabalho1;

import java.util.ArrayList;
import java.util.List;

public class Atividade4 {

	public static void main(String[] args) {

		List<Atividade4Aluno> listAlunos = new ArrayList<>();
		
		String stringAluno1 = "fela1", stringAluno2 = "fela2", stringAluno3 = "fela3";
		double nota1Aluno1 = 4, nota2Aluno1 = 3;
		double nota1Aluno2 = 8, nota2Aluno2 = 9;
		double nota1Aluno3 = 7, nota2Aluno3 = 5;
		
		Atividade4Aluno aluno1 = new Atividade4Aluno(stringAluno1, nota1Aluno1, nota2Aluno1);
		Atividade4Aluno aluno2 = new Atividade4Aluno(stringAluno2, nota1Aluno2, nota2Aluno2);
		Atividade4Aluno aluno3 = new Atividade4Aluno(stringAluno3, nota1Aluno3, nota2Aluno3);
		
		if(aluno1.getNota1() >= 0 && aluno1.getNota1() <= 10 &&
				aluno1.getNota2() >= 0 && aluno1.getNota2() <= 10)
			listAlunos.add(aluno1);
		else {
			System.out.println("NotaInvalidaException");
			return;
		}
		
		if(aluno2.getNota1() >= 0 && aluno2.getNota1() <= 10 &&
				aluno2.getNota2() >= 0 && aluno2.getNota2() <= 10)
			listAlunos.add(aluno2);
		else {
			System.out.println("NotaInvalidaException");
			return;
		}
		
		if(aluno3.getNota1() >= 0 && aluno3.getNota1() <= 10 &&
				aluno3.getNota2() >= 0 && aluno3.getNota2() <= 10)
			listAlunos.add(aluno3);
		else {
			System.out.println("NotaInvalidaException");
			return;
		}
		
		for(Atividade4Aluno aluno : listAlunos) {

			double media = aluno.calcularMedia(aluno.getNota1(), aluno.getNota2());
			
			String situacao = aluno.situacao(media);
			
			System.out.println("Nome: " + aluno.getNome() + " | " + "Média: " + media + " | " + "Situação: " + situacao);
			
		}
		
	}

}
