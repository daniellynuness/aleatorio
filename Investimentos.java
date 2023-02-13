import java.util.Scanner;
import java.text.*;

public class Investimentos {

	public static void main(String[] args) {
		double precoCompra, precoFinal=0.1, rendimento;
		DecimalFormat df = new DecimalFormat("0.00");
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Insira o preço da compra da ação:");
		precoCompra = leia.nextDouble();
		
		int dia = 1;
		
		while (true) {
			System.out.println("Insira o preço da cotação final da ação no dia "+dia);
			precoFinal = leia.nextDouble();
				if (precoFinal < 0.0) break;
			rendimento = precoFinal - precoCompra;
				if (rendimento > 0) {
					System.out.println("Depois do dia "+dia+" você ganhou R$ "+df.format(rendimento)+
							" por ação.");
				} else if (rendimento <0.0) {
					System.out.println("Depois do dia "+dia+" você perdeu R$ "+df.format(-rendimento)+
							" por ação.");
				} else {
					System.out.println("Depois do dia "+dia+" você não teve rendimentos");
				}
				dia+=1;
		}
		leia.close();

	}

}
