package br.edu.ifpb.padroes.transportadora;

import java.util.List;

/**
 * Created by diogomoreira on 25/05/16.
 */
public class Pedido {

	private Endereco endereco;
	private FormaEntregaStrategy formaEntregaStrategy;
	private List<Produto> produtos;

	public Pedido(FormaEntregaStrategy formaEntregaStrategy) {
		this.formaEntregaStrategy = formaEntregaStrategy;
	}

	public void addProduto(Produto p) {
		this.produtos.add(p);
	}

	public void remProduto(Produto p) {
		this.produtos.remove(p);
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public double getValorTotal() {
		double valorTotal = getValorProdutos();
		valorTotal += formaEntregaStrategy.calcularFrete(this);
		return valorTotal;
	}

	private double getValorProdutos() {
		double valorTotal = 0D;
		for (Produto produto: produtos) {
			valorTotal += produto.getPreco();
		}
		return valorTotal;
	}

	public double getPesoTotal() {
		double pesoTotal = 0D;
		for (Produto produto : produtos) {
			pesoTotal += produto.getPeso();
		}
		return pesoTotal;
	}

}