package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while (nota != -1) {
			System.out.println("Digite uma nota ou '-1' p/ sair: ");
			nota = entrada.nextDouble();
		
			
			if(nota <=10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas ++;
				
			} else if (nota != -1) {
				
				System.out.println("Nota invalida, digite novamente!!!");
			}
			
		}
		
		// Calcular media.
		
		double media = total / quantidadeDeNotas;
		
		System.out.println("O total da nota é: " + total);
		System.out.println("Sua media é: " + media);
		System.out.println("Notas validas é: " + quantidadeDeNotas);
		
		
		
		
		entrada.close();
	}

}
