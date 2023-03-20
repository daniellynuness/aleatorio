import java.util.Scanner;

public class Estudantes {

	public static void main(String[] args) {
		Scanner leia =new Scanner (System.in);
		Scanner nome =new Scanner (System.in);
		Scanner idadeAlunos =new Scanner (System.in);
		
		System.out.println("Digite a quantidade de estudantes: ");
		int quantidade = leia.nextInt();
		
		String[] estudantes = new String[quantidade];
		int[] idade = new int[quantidade]; 
		
		for (int i=0;i<quantidade;i++)  {
			System.out.println("Digite o nome: ");
			estudantes[i] = nome.nextLine();
			System.out.println("Digite a idade: ");
			idade[i] = idadeAlunos.nextInt();
		}
		for (int i=0;i<quantidade;i++) {
			if (idade[i] >= 15) {
				System.out.println(estudantes[i]+" pode tomar a vacina. Ele (a) tem "+idade[i]+" anos");
			}
		}
		leia.close();
		nome.close();
		idadeAlunos.close();

	}

}
