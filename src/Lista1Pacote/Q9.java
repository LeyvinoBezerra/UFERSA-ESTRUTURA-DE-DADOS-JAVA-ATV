package Lista1Pacote;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("-----------------");
		System.out.println("-�REA DO C�RCULO-");
		System.out.println("-----------------");
		System.out.println("-----------------");
		System.out.println("Entre Com o Raio:");
		double raio = ler.nextDouble();
		
		if (raio < 0) {

			System.out.println("Raio n�o pode ser menor que zero!");

		} else {
			double area = Math.PI * (raio * raio);
			System.out.printf("�rea do C�culo �: %e \n" , area);

		}

	}

}
