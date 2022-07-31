/*Dado uma string, rearranje seus caracteres de forma que a string se torne um palíndromo (pode ser lido da esquerda para a direita 
 ou da direita para a esquerda). A entrada consiste de umas string composta de apenas letras em caixa alta (A-Z).
Considere que sempre será possível transformar a string em um palíndromo.
LINK: https://sandbox.letscode.com.br/exercicio/0de90875-62c3-4cb3-8dc7-779606c81671*/

package exemplos_diversos;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite uma palavra: ");
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
