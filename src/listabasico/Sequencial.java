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
		System.out.println("Ol�, mundo!");

	}

	public static void segunda() {
		System.out.print("Digite um n�mero: ");
		int numero = scan.nextInt();
		System.out.println("O numero informado foi " + numero);

	}

	public static void terceira() {
		System.out.print("Digite o primeiro n�mero: ");
		float numero1 = scan.nextFloat();
		System.out.print("Digite o segundo n�mero: ");
		float numero2 = scan.nextFloat();
		System.out.print("Digite o terceiro n�mero: ");
		float numero3 = scan.nextFloat();
		float media = (numero1 + numero2 + numero3) / 3;
		System.out.print("A m�dia entre " + numero1 + ", " + numero2 + " e " + numero3 + " �: " + media);

	}

	public static void quarta() {
		System.out.print("Digite o n�mero em metros: ");
		float numero = Float.parseFloat(scan.nextLine());
		float convertido = numero * 100;
		System.out.printf(Locale.US, "%.2f metros � %.2f cent�metros", numero, convertido);

	}

	public static void quinta() {
		System.out.print("Digite o raio do c�rculo: ");
		float numero = Float.parseFloat(scan.nextLine());
		double area = 3.14159 * numero * numero;
		System.out.printf(Locale.US, "A �era do c�rculo � %.2f", area);

	}

}
