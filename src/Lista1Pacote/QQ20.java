package Lista1Pacote;

import java.util.Scanner;

public class QQ20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int contadorDivisores = 0;

		System.out.println("<<<<<<<<<< NÚMERO PRIMO >>>>>>>>>>>");
		System.out.println("DIGITE UM NÚMERO: ");
		int num = ler.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				contadorDivisores++;		
			}
		}	
			
			if (contadorDivisores == 2) {
				System.out.println("Número: " + num + " é primo.");
			} else {
				System.out.println("Número: " + num + " não é primo.");
			} 
			System.out.println("Número de divisores: " + contadorDivisores);
			
			
		ler.close();	
			
	}

}
