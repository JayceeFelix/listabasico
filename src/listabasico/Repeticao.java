package listabasico;

import java.util.Scanner;

public class Repeticao {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//onze();
                //doze();
                //treze();
                //quatorze();
                quinze();
	}

	public static void onze() {
		int numero;
		System.out.print("Digite um número de 0 a 10 ");
		numero = scan.nextInt();

		if (numero < 0 || numero > 10) {
			System.out.println("Número inválido!");
		} else {
                    for(int count = 0; count <=10; count++){
                        System.out.printf("%d * %d = %d \n", numero, count, numero*count);
                    }

		}

	}
        
        public static void doze(){
            int numero;
            do {
		System.out.print("Digite um número de 0 a 10: ");
		numero = scan.nextInt();

		if (numero < 0 || numero > 10) {
			System.out.println("Número inválido!");
		} else {
                    break;

		}
            } while(true);

            
        }
        
        public static void treze(){
            int fulano = 0, ciclano = 0, beltrano = 0;
            
            System.out.print("Quantos eleitores há nessa eleição? ");
            int eleitores = scan.nextInt();
            
            for(int i = 1; i<=eleitores; i++){
                System.out.printf("Escolha um candidato: \n 1 - Fulano \n 2- Ciclano \n 3 - Beltrano \n");
                int candidato = scan.nextInt();
                
                switch(candidato){
                    case 1:
                        fulano +=1;
                        break;
                    case 2:
                        ciclano +=1;
                        break;
                    case 3:
                        beltrano +=1;
                        break;
                    default:
                        System.out.println("Opçao invalida.");
                }
                        
            }
            
            System.out.printf("Quantidade de votos: \n 1 - Fulano: %d \n 2- Ciclano: %d \n 3 - Beltrano: %d \n", fulano, ciclano, beltrano);

        }
        
        public static void quatorze(){
            
            for (int i = 0; i<10; i++){
                System.out.print("Digite um numero: ");
                int numero = scan.nextInt();
                
                if (numero == 1){
                    System.out.println("Invalido :|");
                }
            }
        }
        
        public static void quinze(){
            
        }
}
