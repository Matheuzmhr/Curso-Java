package controle;

import java.util.Scanner;

public class ExerciciosControle {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int maiorNumero = Integer.MIN_VALUE;
		
		System.out.println("Digite 10 números e, ao final, encontraremos o maior número.");

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite 10 numero " + i + " numero? ");
			int numero = entrada.nextInt();
			
			if (numero > maiorNumero) {
				maiorNumero = numero;
			}

		}
		
		System.out.println("O maior número digitado foi: " + maiorNumero);

		entrada.close();

	}

}

/*
 * Exercicio 4
 * 
 * /* Scanner entrada = new Scanner(System.in);
 * 
 * System.out.println("Bem vindo ao verificado de numeros primos");
 * System.out.println();
 * 
 * System.out.print("Informe um numero? ");
 * 
 * int numero = 0;
 * 
 * numero = entrada.nextInt();
 * 
 * if (numero <= 1) { System.out.println("Numero não é primo");
 * 
 * } else { boolean simPrimo = true;
 * 
 * for (int i = 2; i <= Math.sqrt(numero); i++) { if (numero % i == 00) {
 * simPrimo = false; break; } }
 * 
 * if (simPrimo) { System.out.println("Numero é primo"); } else {
 * System.out.println("Número não é primo"); }
 * 
 * }
 * 
 * entrada.close(); }
 * 
 * }
 * 
 */

/*
 * terceiro exercicio
 * 
 * /* Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
 * 
 * double somaNotas = 0.0;
 * 
 * for (int i = 1; i <= 4; i++) {
 * 
 * double nota = 0.0;
 * 
 * System.out.println("Digite sua nota no " + i + " bimestre?"); nota =
 * entrada.nextDouble();
 * 
 * if (nota < 0 || nota > 10.0) {
 * System.out.print("Nota invalida, digite novamente!"); System.out.println();
 * i--; continue; }
 * 
 * somaNotas += nota;
 * 
 * if (nota >= 7 || nota >= 10) { System.out.println("Parabens otima nota!!");
 * System.out.println();
 * 
 * } else if (nota >= 6 || nota == 5) { System.out.println("Dentro da média!!");
 * System.out.println();
 * 
 * 
 * } else if (nota >= 4 || nota == 2) {
 * 
 * System.out.println("Precisa melhorar!!"); System.out.println();
 * 
 * 
 * } else { System.out.println("Pessima nota!!"); System.out.println();
 * 
 * 
 * }
 * 
 * }
 * 
 * Double media = somaNotas / 4; System.out.println("Sua media é " + media);
 * System.out.println();
 * 
 * if (media >=5 || media >= 10) { System.out.println("Parabens você passou!!");
 * 
 * } else { System.out.println("Reprovado!!");
 * 
 * }
 * 
 * entrada.close();
 */

//Segundo exercicio

/*
 * Scanner entrada = new Scanner(System.in);
 * 
 * int ano = 0;
 * 
 * System.out.print("Por gentileza informe o ano? ");
 * 
 * ano = entrada.nextInt();
 * 
 * if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
 * 
 * System.out.println("Esse ano é bissexto!!");
 * 
 * } else {
 * 
 * System.out.println("Não é bissexto!!"); }
 * 
 * entrada.close();
 */

// Primeiro exercicio

/*
 * Scanner entrada = new Scanner (System.in);
 * 
 * System.out.print("Informe um numero de 1 a 10? ");
 * 
 * int numero = entrada.nextInt();
 * 
 * if (numero <=10 & numero >=0) { if (numero % 2 == 0){
 * System.out.println("Numero é par"); }else {
 * System.out.println("Numero é impar"); } } else {
 * 
 * System.out.println("Numero invalido!!!"); }
 * 
 * entrada.close();
 */
