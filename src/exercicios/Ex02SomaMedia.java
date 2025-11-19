package exercicios;

import java.util.Scanner;

public class Ex02SomaMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float nota, somador = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print("[" + (i + 1) + "] Digite sua nota: ");
			nota = sc.nextFloat();
			somador += nota;
		}

		System.out.println("Soma: " + somador);
		System.out.printf("Média: %.2f%n" , (somador / 3.0));

		sc.close();
	}

}
