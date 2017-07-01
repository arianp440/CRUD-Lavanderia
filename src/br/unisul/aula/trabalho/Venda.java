package br.unisul.aula.trabalho;

import java.util.ArrayList;

public class Venda {

	private boolean statusPagamento;
	private boolean statusVenda;

	public boolean isStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(boolean statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

	public boolean isStatusVenda() {
		return statusVenda;
	}

	public void setStatusVenda(boolean statusVenda) {
		this.statusVenda = statusVenda;
	}

	public ArrayList listaClientesDebito() {
		return null;

	}

	public double atualizarValorPagamento(double valor) {

		return valor;
	}

	public void excluirPeca(Roupa roupa) {

	}

	public void alterarQntPeca(Roupa roupa) {

	}

	public double calcularPrecoPagar(int valor) {
		return valor;
	}
}
