package Lista1Pacote;

import java.util.Scanner;

public class QQ10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um Numero Inteiro:\n");
		int num = ler.nextInt();

		if (num % 2 == 0) {
			System.out.println("O Numero � Par!" + " " + num);
		} else {
			System.out.println("O Numero � Impar!" + " " + num);
		}
	}

}
