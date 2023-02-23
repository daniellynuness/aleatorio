import java.util.ArrayList;
import java.util.Scanner;

public class Orcamento {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double total, soma=0;
		int i=0;
		
		System.out.println("Quanto você pode gastar?");
		total = leia.nextDouble();
		
		ArrayList<Double> proporcao = new ArrayList<Double>();
		System.out.println("Insira quantos % pretende gastar por despesa.");
		System.out.println("O sistema irá parar se o acumulo de % passar de 100.");
		do {
			System.out.println("Sua proporção de despesa "+(i+1)+":");
			double valor = leia.nextDouble();
			proporcao.add(valor);
			soma += proporcao.get(i);
			i++;
		} while (soma <= 100);
		
		if (soma > 100) {
			double somaAcomulativa = 0.0;
			for (int x=0; x<proporcao.size()-1;x++) {
				somaAcomulativa += proporcao.get(x);
			}
			proporcao.set(proporcao.size()-1, 100.0 - somaAcomulativa);
		}
		for (double valor:proporcao) {
			double despesa = valor*total/100.0;
			System.out.println("Seu "+valor+"% é igual à R$ "+despesa);
		}

	}

}
