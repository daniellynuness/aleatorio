import java.util.Scanner;

/* Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. */

public class Dias {

	public static void main(String[] args) {
		int ano, mes, dia, totalDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem atualmente?");
		ano = leia.nextInt();
		System.out.println("Quantos meses (completos) você tem atualmente?");
		mes = leia.nextInt();
		System.out.println("Com relação ao último mês, quantos dias se passaram até a data de hoje?");
		dia = leia.nextInt();
		
		totalDias = (ano*365)+(mes*30)+dia;
		
		System.out.println("Até o dia de hoje, você viveu "+totalDias+" dias!");

	}

}
