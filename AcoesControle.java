
public class AcoesControle {

	public static void main(String[] args) {
		Acoes empresaABC = new Acoes();
		empresaABC.comprar(30.0, 2000);
		//empresaABC.comprar(40.0, 3000);
		empresaABC.vender(20.0, 1000);
		
		System.out.println(empresaABC.getPreco());
		System.out.println(empresaABC.getVenda());
		System.out.println(empresaABC.getPrecoMedio());

	}

}
