package br.unisul.aula.trabalho;

import java.util.ArrayList;

public class Cliente {

	private String nome;
	private String cpf;
	private int telefone;
	private ArrayList<Servico> historicoCliente;

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

	public ArrayList<Servico> getListaHistoricoCliente() {
		return historicoCliente;
	}

	public void setListaHistorico(ArrayList<Servico> listaHistoricoCliente) {
		this.historicoCliente = listaHistoricoCliente;
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
