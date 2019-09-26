package trabalho1;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] strings = new String[3];
		String tempString;
		
		strings[0] = scanner.next();
		strings[1] = scanner.next();
		strings[2] = scanner.next();
		
		for (int j = 0; j < strings.length; j++) {
			
	         for (int i = j + 1; i < strings.length; i++) {
	        	 
	            if (strings[i].compareTo(strings[j]) < 0) {
	            	tempString = strings[j];
	            	strings[j] = strings[i];
	            	strings[i] = tempString;
	            }
	            
	         }
	         
	         System.out.println("String " + (j + 1) + ": " + strings[j]);
	         
		}
				
	}

}
