package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o dia semana: ");
		
		String dia = entrada.next();
		
		if (dia.equalsIgnoreCase("Domingo")) {
			System.out.println("O seu número é 1!");
		} else if (dia.equalsIgnoreCase("Segunda")) {
			System.out.println("O seu número é 2!");
		} else if (dia.equalsIgnoreCase("Terça")) {
			System.out.println("O seu número é 3!");
		} else if (dia.equalsIgnoreCase("Quarta")) {
			System.out.println("O seu número é 4!");
		} else if (dia.equalsIgnoreCase("Quinta")) {
			System.out.println("O seu número é 5!");
		} else if (dia.equalsIgnoreCase("Sexta")) {
			System.out.println("O seu número é 6!");
		} else if (dia.equalsIgnoreCase("Sabado")) {
			System.out.println("O seu número é 7!");
		} else {
				System.out.println("Digite um dia da semana correto.");
				
				entrada.close();
			}
					

	}

}
