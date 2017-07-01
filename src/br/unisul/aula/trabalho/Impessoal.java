package br.unisul.aula.trabalho;

public class Impessoal extends Roupa {

	private double peso;

	public Impessoal() {
		setPreco(20);

	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public double calcularValor() {

		return peso * preco;

	}

}
