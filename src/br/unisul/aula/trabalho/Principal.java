package br.unisul.aula.trabalho;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		ArrayList listaClientes = new ArrayList();
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
				listaClientes.add(cli);

				break;

			case 2:
				JOptionPane.showMessageDialog(null, listaClientes);
				break;
			case 3:
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
}
