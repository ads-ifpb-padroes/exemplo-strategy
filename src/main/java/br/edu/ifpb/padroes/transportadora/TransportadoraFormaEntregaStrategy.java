package br.edu.ifpb.padroes.transportadora;

/**
 * Created by diogomoreira on 25/05/16.
 */
public class TransportadoraFormaEntregaStrategy implements FormaEntregaStrategy {

	public double calcularFrete(Pedido pedido) {
		double valorTotal = 35D;
		valorTotal += 4D * pedido.getPesoTotal();
		return valorTotal;
	}

	public String getName() {
		return "Transportadora";
	}
}
