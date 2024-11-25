package listabasico;

import java.util.Scanner;

public class Repeticao {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// onze();
		// doze();
		// treze();
		//quatorze();
		// quinze();
		dezesseis();
	}

	public static void onze() {
		int numero;
		System.out.print("Digite um n√∫mero de 0 a 10 ");
		numero = scan.nextInt();

		if (numero < 0 || numero > 10) {
			System.out.println("N√∫mero inv√°lido!");
		} else {
			for (int count = 0; count <= 10; count++) {
				System.out.printf("%d * %d = %d \n", numero, count, numero * count);
			}

		}

	}

	public static void doze() {
		int numero;
		do {
			System.out.print("Digite um n√∫mero de 0 a 10: ");
			numero = scan.nextInt();

			if (numero < 0 || numero > 10) {
				System.out.println("N√∫mero inv√°lido!");
			} else {
				break;

			}
		} while (true);

	}

	public static void treze() {
		int fulano = 0, ciclano = 0, beltrano = 0;

		System.out.print("Quantos eleitores h√° nessa elei√ß√£o? ");
		int eleitores = scan.nextInt();

		for (int i = 1; i <= eleitores; i++) {
			System.out.printf("Escolha um candidato: \n 1 - Fulano \n 2- Ciclano \n 3 - Beltrano \n");
			int candidato = scan.nextInt();

			switch (candidato) {
			case 1:
				fulano += 1;
				break;
			case 2:
				ciclano += 1;
				break;
			case 3:
				beltrano += 1;
				break;
			default:
				System.out.println("Op√ßao invalida.");
			}

		}

		System.out.printf("Quantidade de votos: \n 1 - Fulano: %d \n 2- Ciclano: %d \n 3 - Beltrano: %d \n", fulano,
				ciclano, beltrano);

	}

	public static void quatorze() {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[10];

		System.out.println("Digite 10 n˙meros: ");

		for (int i = 0; i < 10; i++) {
			numbers[i] = scanner.nextInt();
		}

		for (int number : numbers) {
			if (isPrime(number)) {
				System.out.println(number + " È primo.");
			} else {
				System.out.println(number + " n„o È primo.");
			}
		}
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void quinze() {
		int n = 10;
		int a = 0, b = 1;

		System.out.println("Os primeiros " + n + " termos da sequÍncia de Fibonacci s„o:");
		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			int proximo = a + b;
			a = b;
			b = proximo;
		}

	}
	
	public static void dezesseis() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um n˙mero inteiro: ");
        int number = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
        scanner.close();
	}
}
