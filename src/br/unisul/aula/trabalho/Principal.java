package br.unisul.aula.trabalho;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	static ArrayList<Servico> servicos;
	static ArrayList<Cliente> clientes;
	public static void main(String[] args) {

		clientes = new ArrayList<>();
		servicos = new ArrayList<>();
		
		int opcao = 1;
		while (opcao > 0 && opcao < 8) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("CRUD - LAVANDERIA \n\n" + "1 - Cadastrar Cliente.\n"
					+ "2 - Receber Roupas para Lavação / Realizar Venda.\n"
					+ "3 - Listar Clientes com débito em aberto.\n"
					+ "5 - Alterar Peças de Roupas da Lavação / Alterar Venda.\n"
					+ "6 - Entrega das Roupas aos Clientes / Concluir Venda. \n" + "7 - Sair. "));

			switch (opcao) {
			case 1:
				Cliente cli = new Cliente();
				cli.setNome(JOptionPane.showInputDialog(null, "Informe Nome: "));
				cli.setCpf(JOptionPane.showInputDialog(null, "Informe CPF: "));
				cli.setTelefone(Integer.parseInt(JOptionPane.showInputDialog(null, "Informar Telefone: ")));
				clientes.add(cli);
				break;

			case 2:
				
				String pesquisaPorCPF = JOptionPane.showInputDialog("1) Digite seu CPF");
				
				Cliente cliente = pesquisarCliente(pesquisaPorCPF);
				
				if(cliente != null){
				
				// SubMenu de Cadastro das Roupas.
				int subMenu = Integer
						.parseInt(JOptionPane.showInputDialog("1) Roupa Pessoal.\n2) Roupa Impessoal.\n3) Voltar"));
				
				Servico servico = new Servico(false, false);
				
				while (subMenu >= 1 && subMenu < 3) {

					switch (subMenu) {
					case 1:
												
						// subMenuTipoDeRoupa para selecionar o tipo de Roupa que
						// deseja cadastrar (pessoal e impessoal)
						int quantidadeRoupasPessoais = Integer.parseInt(JOptionPane.showInputDialog(
								"1) Roupa pessoal é por quantidade.\n Por favor, qual a quantidade? "));							
						
						int quantidadeRoupasPessoaisDelicadas = Integer.parseInt(
								JOptionPane.showInputDialog("1) O preço é diferente para roupas delicadas.\n "
										+ "Por favor, desta quantidade quantas são roupas delicadas? "));
						
						for(int i = 0; i < quantidadeRoupasPessoais; i++)
						{
							RoupaPessoal roupaPessoal = new RoupaPessoal();
							
							for(int j = 0; j < quantidadeRoupasPessoaisDelicadas; j ++)
							{
								roupaPessoal.setDelicada(true);
								roupaPessoal.setPreco(Servico.VALOR_ROUPA_DELICADA);
							}
							
							if(!roupaPessoal.getDelicada())
							{
								roupaPessoal.setPreco(Servico.VALOR_ROUPA_NORMAL);
							}
							
							servico.roupas.add(roupaPessoal);
						}
						
						break;
					case 2:
						// TODO comentário
						double qtdQuilos = Double.parseDouble(JOptionPane
								.showInputDialog("1) Roupa impessoal é por peso.\n Por favor, quantos quilos serão? "));
		
						servico.roupas.add(new RoupaImpessoal(qtdQuilos));				
						break;
					}
					
					break;
				}
				// Calcula o valor pela lista de roupas
				servico.setValorTotal(servico.roupas);
				// Adiciona a lista de servicos
				servicos.add(servico);
//				clientes.get(index)
				}
				break;
			case 3:
				listarClientes();
				break;
			case 4:
				break;

			case 5:
				break;

			case 6:
				break;
			case 7:
				System.exit(0);

			}

		}
	}
	
	public static void listarClientes(){
	
		String listaClientes = "";

	for (Cliente cliente : clientes) {

			listaClientes += String.format("Nome: %s\nCPF: %s\nValor a ser pago:"
					+ " %s\n",
					cliente.getNome(), cliente.getCpf(), valorSerPago(cliente.getListaHistoricoCliente()));

	}

	JOptionPane.showMessageDialog(null, listaClientes);
	}
	
	public static Cliente pesquisarCliente(String pCpf)
	{
		for(Cliente cliente : clientes)
		{
			if(cliente.getCpf().equalsIgnoreCase(pCpf))
			{
				return cliente;
			}
		}
		
		return null; 
	}
	
	public static double valorSerPago(ArrayList<Servico> servicos)
	{
		double valorSerPago = 0.0;
		
		for(Servico servico : servicos)
		{
			valorSerPago += servico.getValorTotal();
		}
		
		return valorSerPago;
	}
}