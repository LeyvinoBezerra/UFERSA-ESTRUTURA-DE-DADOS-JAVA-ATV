package Lista1Pacote;

import java.util.Scanner;

public class QQ14 {

	public static void main(String[] args) {

		int a, b, c, delta, d = -4, b2, v2;
		double r2, r1;

		Scanner ler = new Scanner(System.in);

		System.out.println("Seja bem vindo a Calculadora de Equa��es do 2� Grau !");
		System.out.print("Digite o termo \"a\": ");
		a = ler.nextInt();
		System.out.print("Digite o termo \"b\": ");
		b = ler.nextInt();
		System.out.print("Digite o termo \"c\": ");
		c = ler.nextInt();

		System.out.println("");

		System.out.println("APLICA��O DA F�RMULA DE B�SKARA: ");
		System.out.println("Resolu��o da F�rmula de B�skara: b�-4.a.c ");
		System.out.println("Resolu��o da F�rmula de B�skara: " + b + "�" + d + "*" + a + "*" + c);
		b2 = b * b;
		v2 = ((-4) * (a) * (c));
		delta = (b * b) + ((-4) * (a) * (c));
		if (v2 > 0) {
			System.out.println("Resolu��o da F�rmula de B�skara: " + b2 + "+" + v2);
		} else
			System.out.println("Resolu��o da F�rmula de B�skara: " + b2 + "-" + v2);
		System.out.println("Resolu��o da F�rmula de B�skara: " + (delta));

		System.out.println("");

		System.out.println("Resultados das ra�zes: ");
		if (delta < 0) {
			System.out.println("N�o existe ra�z real, Delta=0");
		} else {
			r1 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("A 1� ra�z �: " + r1);
			r2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("A 2� ra�z �: " + r2);

		}

	}
}
