package exercicios;

import java.util.Scanner;

public class Ex08AreaCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do raio: ");
		double raio = sc.nextDouble();

		double area = Math.PI * Math.pow(raio, 2);

		System.out.printf("A área: %.2f%n", area);

		sc.close();
	}

}
