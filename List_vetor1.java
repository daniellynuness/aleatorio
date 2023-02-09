//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.

import java.util.Scanner;

public class List_vetor1 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		
		int vetor [] = new int [5], x, maior=vetor[0];
		
		for(x=0;x<5;x++)
		{
			System.out.println("Digite um numero: ");
			vetor[x] = ler.nextInt();
		}
		for(x=0;x<5;x++)
		{
			if(maior<vetor[x])
			{
				maior=vetor[x];
			}
		}
		System.out.println("\nO maior valor: "+maior);

	}

}
