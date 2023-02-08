import java.util.Scanner;

/*Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F) */
public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        int c;
        
        System.out.println("Digite a temperatura (C) que você deseja converter: ");
        c = leia.nextInt();

        System.out.println("A temperatura em graus Celcius é: "+c);
        System.out.println("Em Kelvin é: "+(c+273.15));
        System.out.println("Em Réaumur é: "+(c*0.8));
        System.out.println("Em Rankine é: "+(c*1.8+32+459.67));
        System.out.println("Em Fahrenheit é: "+(c*1.8+32));



    }
}
