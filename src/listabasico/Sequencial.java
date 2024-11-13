package listabasico;

import java.util.Locale;
import java.util.Scanner;

public class Sequencial {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		primeira();
		// segunda();
		// terceira();
		// quarta();
		// quinta();

	}

	public static void primeira() {
		System.out.println("Olá, mundo!");

	}

	public static void segunda() {
		System.out.print("Digite um número: ");
		int numero = scan.nextInt();
		System.out.println("O numero informado foi " + numero);

	}

	public static void terceira() {
		System.out.print("Digite o primeiro número: ");
		float numero1 = scan.nextFloat();
		System.out.print("Digite o segundo número: ");
		float numero2 = scan.nextFloat();
		System.out.print("Digite o terceiro número: ");
		float numero3 = scan.nextFloat();
		float media = (numero1 + numero2 + numero3) / 3;
		System.out.print("A média entre " + numero1 + ", " + numero2 + " e " + numero3 + " é: " + media);

	}

	public static void quarta() {
		System.out.print("Digite o número em metros: ");
		float numero = Float.parseFloat(scan.nextLine());
		float convertido = numero * 100;
		System.out.printf(Locale.US, "%.2f metros é %.2f centímetros", numero, convertido);

	}

	public static void quinta() {
		System.out.print("Digite o raio do círculo: ");
		float numero = Float.parseFloat(scan.nextLine());
		double area = 3.14159 * numero * numero;
		System.out.printf(Locale.US, "A áera do círculo é %.2f", area);

	}

}
