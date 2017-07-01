package br.unisul.aula.trabalho;

abstract class Roupa {
	private double valorPeca;
	public double preco;
	
	
	public Roupa() {
		super();
		
	}


	public double getValorPeca() {
		return valorPeca;
	}



	public void setValorPeca(double valorPeca) {
		this.valorPeca = valorPeca;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	public abstract double calcularValor();

}
