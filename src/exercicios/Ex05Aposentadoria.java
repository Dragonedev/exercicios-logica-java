package exercicios;

import java.util.Scanner;

public class Ex05Aposentadoria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		if(idade>=65) {
			System.out.println("Já apta a aposentadoria");
		} else {
			System.out.println("Não apta a aposentadoria");
		}
		
		sc.close();
	}

}
