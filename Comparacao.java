import java.util.Scanner;

/* Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. 
 * Fazer um algoritmo que calcule e escreva: a. a maior e a menor altura do grupo;
b. média de altura dos homens; c. o número de mulheres */
public class Comparacao {

	public static void main(String[] args) {
		float altura, soma=0, media=0, maior=0, menor=10;
		int sexo, qtdMulheres=0, qtdHomens=0;
		
		Scanner leia = new Scanner (System.in);
		
		for (int i=0; i<4; i++) {
			System.out.println("Informe seu sexo: (1) para feminino ou (2) para masculino");
			sexo = leia.nextInt();
			System.out.println("Informe a sua altura: ");
			altura = leia.nextFloat();
			if (sexo == 1) {
				qtdMulheres++;
			} else if (sexo == 2) {
				qtdHomens++;
				soma = soma+altura;
			} else {
				System.out.println("Opção inválida");
			}
			if (altura > maior) {
				maior = altura;
			} else if (altura < menor) {
				menor = altura;
			}
		}
			media = soma/qtdHomens;
			
			System.out.println("A maior altura do grupo é de " + maior + " m, e a menor é de " + menor + " m");
	        System.out.println("A média de altura dos homens é " + media + " m");
	        System.out.println("O número de mulheres é " + qtdMulheres);
	        

	}

}
