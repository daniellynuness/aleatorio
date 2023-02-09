/*Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.*/
public class Media {

	public static void main(String[] args) {
		float media1, media2, soma, mediaGeral;
		
		media1 = (8+9+7)/3;
		media2 = (4+5+6)/3;
		soma = media1+media2;
		mediaGeral = (media1+media2)/2;
		
		System.out.println("A média de 8,9 e 7 é: "+media1+","+"\n a média de 4, 5 e 6 é: "+media2+
				","+ "\n a soma das duas médias é: "+soma+"\n e a média das duas médias é "+mediaGeral);

	}

}
