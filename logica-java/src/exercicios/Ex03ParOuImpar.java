package exercicios;

import java.util.Scanner;

public class Ex03ParOuImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int n1 = sc.nextInt();

		if (n1 % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}

		sc.close();
	}

}
