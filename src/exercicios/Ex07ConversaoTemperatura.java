package exercicios;

import java.util.Scanner;

public class Ex07ConversaoTemperatura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma temperatura em °C: ");
		double celsius = sc.nextDouble();

		double fahrenheit = (celsius * 9 / 5) + 32;

		System.out.println(celsius + "°C em fahrenheit: " + fahrenheit + "°F");

		sc.close();
	}

}
