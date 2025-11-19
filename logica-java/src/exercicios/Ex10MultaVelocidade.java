package exercicios;

import java.util.Scanner;

public class Ex10MultaVelocidade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a velocidade: ");
		int velocidade = sc.nextInt();
		
		if(velocidade >=80) {
			System.out.println("Multado!");
		} else {
			System.out.println("Velocidade permitida.");
		}
		
		sc.close();
	}

}
