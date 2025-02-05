package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		// if(boolean)...
		String faixa = "Amarela";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "Roxa":
			System.out.println("Sei o Heian Godan");
		case "Verde":
			System.out.println("Sei o Heian Yodan");
		case "Laranha":
			System.out.println("Sei o Heian Sandan");
		case "Vermelha":
			System.out.println("Sei o Heian Nidan");
		case "Amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("Não sei nada");
		}

	}

}
