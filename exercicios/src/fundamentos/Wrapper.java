package fundamentos;

public class Wrapper {

	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 1000;
		
		//Integer.parseInt(entrada.next());
		Integer i = 1000; // int
		Long l = 10000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "...");
		
		 
	}

}
