package exemplos_diversos;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite uma palavra ou frase: ");
		String palavra = leia.nextLine();
		String palindromo = ""; 

		for (int x = palavra.length() - 1; x >= 0; x--) { 
			palindromo += palavra.charAt(x); 
		}
		if (palindromo.equals(palavra)) { 
			System.out.println("é palindromo!" + "\n" + palindromo);
		} else {
			System.out.println("não é palindromo :(" + "\n" + palindromo);
		}
		
	}

}
