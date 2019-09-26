package trabalho1;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numero1;
		int numero2;
		
		numero1 = scanner.nextInt();
		numero2 = scanner.nextInt();
		
		if (numero1 > numero2)
			System.out.println("Maior número: " + numero1 + ", menor número: " + numero2);
		else if (numero2 > numero1)
			System.out.println("Maior número: " + numero2 + ", menor número: " + numero1);
		else
			System.out.println("Os números são iguais");
		
	}

}
