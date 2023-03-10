
public class Escada {

	public static void main(String[] args) {
		int numeroDregraus = 10, larguraDegrau = 3;
		
		for (int i=0; i<numeroDregraus; i++) {
			for (int j=0; j<(i+1)*larguraDegrau; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
