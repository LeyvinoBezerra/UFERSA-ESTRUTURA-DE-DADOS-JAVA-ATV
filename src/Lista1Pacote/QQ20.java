package Lista1Pacote;

import java.util.Scanner;

public class QQ20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int contadorDivisores = 0;

		System.out.println("<<<<<<<<<< N�MERO PRIMO >>>>>>>>>>>");
		System.out.println("DIGITE UM N�MERO: ");
		int num = ler.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				contadorDivisores++;		
			}
		}	
			
			if (contadorDivisores == 2) {
				System.out.println("N�mero: " + num + " � primo.");
			} else {
				System.out.println("N�mero: " + num + " n�o � primo.");
			} 
			System.out.println("N�mero de divisores: " + contadorDivisores);
			
			
		ler.close();	
			
	}

}
