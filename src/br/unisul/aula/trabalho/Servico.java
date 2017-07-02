package br.unisul.aula.trabalho;

import java.util.ArrayList;

public class Servico {

	public static final double VALOR_ROUPA_QUILO = 20.0;
	public static final double VALOR_ROUPA_DELICADA = 7.0;
	public static final double VALOR_ROUPA_NORMAL = 3.0;
	private boolean statusPagamento;
	private boolean statusServico;
	private double valorTotal;
	
	ArrayList<Roupa> roupas;
	
	public Servico(boolean statusPagamento, boolean statusServico) {
		super();
		this.statusPagamento = statusPagamento;
		this.statusServico = statusServico;
		roupas = new ArrayList<>();
	}

	public boolean isStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(boolean statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

	public boolean isStatusServico() {
		return statusServico;
	}

	public void setStatusServico(boolean statusServico) {
		this.statusServico = statusServico;
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
	
	public double getValorTotal() {
		return valorTotal;
	}

	// TODO: Calcular por double, talvez por regra de 3, tendo em vista o quilo valendo 20.
	// Ex: 3.5 quilo = 70 reais.
	void setValorTotal(ArrayList<Roupa> roupas) {
		this.valorTotal = calcularValor(roupas);
	}

	public double calcularValor(ArrayList<Roupa> pRoupas) {

		double valorTotalRoupaPessoal = 0.0;
		double valorTotalRoupaImpessoal = 0.0;
		
		for(Roupa roupa : pRoupas)
		{
			if(roupa instanceof RoupaPessoal)
			{
					valorTotalRoupaPessoal += roupa.getPreco();
			}
			else
			{
				valorTotalRoupaImpessoal = ((RoupaImpessoal)roupa).getPeso() * VALOR_ROUPA_QUILO;
			
			}
		}
				
		return valorTotalRoupaPessoal + valorTotalRoupaImpessoal;
	}
}
