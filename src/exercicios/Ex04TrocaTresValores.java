package exercicios;

import java.util.Scanner;

public class Ex04TrocaTresValores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aux = 0;

		System.out.println("Digite o valor de A: ");
		int a = sc.nextInt();

		System.out.println("Digite o valor de B: ");
		int b = sc.nextInt();

		System.out.println("Digite o valor de C: ");
		int c = sc.nextInt();

		aux = b;
		b = a;
		a = c;
		c = aux;

		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.println("C: " + c);

		sc.close();
	}

}
