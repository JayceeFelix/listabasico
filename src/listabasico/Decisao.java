package listabasico;

import java.util.Scanner;

public class Decisao {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// seis();
		// sete();
		// oito();
		// nove();
		dez();
	}

	public static void seis() {
		System.out.print("Digite o preço do primeiro produto: ");
		float preco1 = scan.nextFloat();
		System.out.print("Digite o preço do segundo produto: ");
		float preco2 = scan.nextFloat();
		System.out.print("Digite o preço do terceiro produto: ");
		float preco3 = scan.nextFloat();

		if (preco1 < preco2) {
			System.out.println("Escolher produto 1! " + preco1);
		} else if (preco3 < preco2) {
			System.out.println("Escolher produto 3! " + preco3);
		} else {
			System.out.println("Escolher produto 2! " + preco2);
		}

	}

	public static void sete() {
		float count = 0;
		int n = 0;
		float notas = 0;
		System.out.println("Obs: Para sair do contador digite uma nota negativa ");
		while (count >= 0) {
			notas += count;
			n++;
			System.out.print("Digite uma nota: ");
			count = scan.nextFloat();
		}
		;
		float media = notas / (n - 1);
		System.out.printf("A média é %.2f", media);
		if (media >= 7) {
			System.out.println("Aluna aprovada!");
		} else {
			System.out.println("Aluna reprovada!");
		}
	}

	public static void oito() {
		System.out.print("Digite nota 1: ");
		float n1 = scan.nextFloat();
		System.out.print("Digite nota 2: ");
		float n2 = scan.nextFloat();

		float mediaFinal = (n1 + n2) / 2;
		if (mediaFinal >= 7) {
			System.out.printf("Aluno aprovado por média %.2f!", mediaFinal);
		} else if (mediaFinal >= 4) {
			System.out.printf("Aluno irá fazer AF! Média: %.2f \n", mediaFinal);
			System.out.print("Digite a nota da AF: ");
			float notaAF = scan.nextFloat();
			mediaFinal = (mediaFinal + notaAF) / 2;
			System.out.printf("Nota da AF %.2f e Média Final atual %.2f \n", notaAF, mediaFinal);
			if (mediaFinal >= 5) {
				System.out.println("Aluno aprovado na AF!");
			} else {
				System.out.println("Aluno reprovado :(");
			}

		} else {
			System.out.println("Reprovaodo :(");
		}

	}

	public static void nove() {
		System.out.print("Digite o primeiro valor: ");
		float n1 = scan.nextFloat();
		System.out.print("Digite o segundo valor: ");
		float n2 = scan.nextFloat();
		System.out.print("Digite o terceiro valor: ");
		float n3 = scan.nextFloat();

		if (n1 > n2 && n1 > n3) {
			System.out.printf("O valor maior é %.2f", n1);
		} else if (n2 > n3) {
			System.out.printf("O valor maior é %.2f", n2);
		} else {
			System.out.printf("O valor maior é %.2f", n3);
		}
	}

	public static void dez() {
		System.out.print("Digite o valor: ");
		int valor = scan.nextInt();

		if (valor % 2 == 0) {
			System.out.println("O valor é par!");
		} else {
			System.out.println("O valor é ímpar!");
		}
	}

}
