package br.edu.ifpb.padroes.transportadora;

/**
 * Created by diogomoreira on 25/05/16.
 */
public class SedexFormaEntregaStrategy implements FormaEntregaStrategy {

	public double calcularFrete(Pedido pedido) {
		double valorTotal = 50D;
		valorTotal += 2.5D * pedido.getPesoTotal();
		return valorTotal;
	}

	public String getName() {
		return "Sedex";
	}
}
