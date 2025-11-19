package exercicios;

import java.util.Scanner;

public class Ex06SalarioBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salarioFinal = 0;
		System.out.print("Digite seu salário: ");
		double salario = sc.nextDouble();

		if (salario < 2000) {
			salarioFinal = salario + (salario * 0.1);
		}

		System.out.println("Salário Final: " + salarioFinal);

		sc.close();
	}

}
