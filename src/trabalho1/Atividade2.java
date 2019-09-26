package trabalho1;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numero;
		
		numero = scanner.nextInt();
		
		for (int iteracao = 2; iteracao <= numero; iteracao++) 
            if( isPrimo(iteracao) )
                System.out.println("Número " + iteracao + " é número primo");

	}

    private static boolean isPrimo(int numero) {
    	
        for (int iteracao = 2; iteracao < numero; iteracao++)
            if (numero % iteracao == 0)
                return false;   
        
        return true;
        
    }
	
}
