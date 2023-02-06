import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int numero = 0, resultado, x;

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um n�mero para ver sua tabuada: ");
		numero = ler.nextInt();

		for (x = 1; x <= 10; x++) {
			resultado = numero*x;
			System.out.println(numero+" x "+x+" = "+resultado);

		}

	}
}
