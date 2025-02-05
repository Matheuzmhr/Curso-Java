package controle;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Boolean continuar = true;

		System.out.println("Bem vindo a calculadora!!!");
		System.out.println();

		while (continuar) {
			
			System.out.println();
			System.out.print("Digite o Primeiro numero: ");
			double primeiroNumero = entrada.nextDouble();
			
			System.out.print("Digite o operador: + - / *: ");
			String operador = entrada.next();

			System.out.print("Informe o segundo numero: ");
			double segundoNumero = entrada.nextDouble();

			double resultado = 0;

			if (operador.equals("+")) {
				resultado = primeiroNumero + segundoNumero;

			} else if (operador.equals("-")) {
				resultado = primeiroNumero - segundoNumero;

			} else if (operador.equals("/")) {
				resultado = primeiroNumero / segundoNumero;

				if (segundoNumero != 0) {
					resultado = primeiroNumero / segundoNumero;

				} else {
					System.out.println("Erro! divisão por 0");
					continue;
				}

			} else if (operador.equals("*")) {

				resultado = primeiroNumero * segundoNumero;

			} else {

				System.out.println("Operador invalido");
				continue;
				
				

			}
			
			// Calculo do resultado
			
			System.out.println();
			System.out.println("Resultado: " + resultado);

			System.out.println();
			System.out.print("Deseja sair (Sim ou Não): ");
			String resposta = entrada.next();

			if (resposta.equalsIgnoreCase("Sim")) {

				continuar = false;
				
				System.out.println();
				System.out.println("Obrigado!!!");
				
				

			}

		}
		
        entrada.close();

	}
}
