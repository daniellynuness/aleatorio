import java.text.DecimalFormat;
import java.util.Scanner;

//Informar um saldo e imprimir o saldo com reajuste de 1%
public class Saldo {

	public static void main(String[] args) {
		
		double saldoInicial, saldoFinal, reajuste;
		
		Scanner leia = new Scanner (System.in);
		DecimalFormat reduzir = new DecimalFormat("0.00");
		
		System.out.println("Por favor informe seu saldo: ");
		saldoInicial = leia.nextDouble();
		
		reajuste = saldoInicial*0.01;
		
		saldoFinal = saldoInicial+reajuste;
		
		System.out.println("Após o reajuste de 1% seu saldo final é de: "+reduzir.format(saldoFinal));
	}

}
