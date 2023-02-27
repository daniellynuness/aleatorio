
public class Acoes {

	private int venda;
	private double preco; 
	private double capital;
	public void comprar(double p, int v) {
		venda += v;
		preco = p;
		capital += v*p;
	}
	public void vender (double p, int v) {
		venda -= v;
		preco = p;
		capital -= v*p;
	}
	public int getVenda() {
		return venda;
	}
	public double getPreco() {
		return preco;
	}
	public double getPrecoMedio () {
		return capital/getVenda();
	}

}
