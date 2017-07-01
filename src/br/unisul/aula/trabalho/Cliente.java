package br.unisul.aula.trabalho;

import java.util.ArrayList;

public class Cliente extends Venda {

	private String nome;
	private String cpf;
	private int telefone;
	private double valorPagar;
	private ArrayList listaClientes;
	private ArrayList listaHistoricoCliente;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getValorPagar() {
		return valorPagar;
	}

	public void setValorPagar(double valorPagar) {
		this.valorPagar = valorPagar;
	}

	public ArrayList getListaHistoricoCliente() {
		return listaHistoricoCliente;
	}

	public void setListaHistorico(ArrayList listaHistoricoCliente) {
		this.listaHistoricoCliente = listaHistoricoCliente;
	}

	public ArrayList getListaClientes() {
		return listaClientes;
	}

	public void setListaCliente(ArrayList listaClientes) {
		this.listaClientes = listaClientes;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public void listarClientes() {

	}

	public void listarHistoricoCliente() {

	}

}
