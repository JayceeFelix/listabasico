package listabasico;

import java.util.Scanner;

public class Repeticao {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		onze();
	}

	public static void onze() {
		int count = 0, numero;
		System.out.print("Digite um número de 0 a 10 ");
		numero = scan.nextInt();

		if (numero < 0 || numero > 10) {
			System.out.println("Número inválido!");
		} else {

		}

	}
}
