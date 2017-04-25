package br.edu.ifpb.padroes.transportadora;

/**
 * Created by diogomoreira on 25/05/16.
 */
public interface FormaEntregaStrategy {

	double calcularFrete(Pedido pedido);

	/**
	 * Novas estratégias devem informar o nome
	 *
	 * @return O nome bonito da estratégia
	 */
	String getName();

}
