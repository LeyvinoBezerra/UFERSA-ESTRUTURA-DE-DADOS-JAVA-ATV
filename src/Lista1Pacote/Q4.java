package Lista1Pacote;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com o numero:");
		float n1 = ler.nextFloat();

		System.out.println("Entre com o numero:");
		float n2 = ler.nextFloat();

		System.out.println("Entre com o numero:");
		float n3 = ler.nextFloat();
		
		float media = (n1 + n2 + n3) / 3;
		
		System.out.printf("A média é =  %.2f\n", media);
	}

}
