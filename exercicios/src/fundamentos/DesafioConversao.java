package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o seu salário de um mês atrás? ");
		String UmMes = scanner.next().replace(",",".");
		
		System.out.print("\nDigite o seu salário dois mêses atrás? ");
		String DoisMeses = scanner.next().replace(",",".");
		
		System.out.print("\nDigite o seu salário três mêses atrás? ");
		String TresMeses = scanner.next().replace(",",".");
				
		double numero1 = Double.parseDouble(UmMes);
		double numero2 = Double.parseDouble(DoisMeses);
		double numero3 = Double.parseDouble(TresMeses);
		
		double MediaSalario = (numero1  + numero2 + numero3) / 3 ;
		
		MediaSalario = Math.round(MediaSalario * 100.0) / 100.0;
		
		System.out.println("\nA média salarial dos últimos três meses é "
				+ MediaSalario);

		
		scanner.close();
		
		
		
	}

}
