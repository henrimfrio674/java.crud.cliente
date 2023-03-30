package principal;

import java.util.Scanner;

import controllers.ClienteRController;

public class Program {

	public static void main(String[] args) {
		System.out.println("{1} CADASTRAR");
		System.out.println("{2} ATUALIZAR");
		System.out.println("{3} EXCLUIR");
		System.out.println("{4} VER");

		Scanner scanner = new Scanner(System.in);

		System.out.print("\nEscolha :");
		Integer opcao = Integer.parseInt(scanner.nextLine());

		ClienteRController clienteController = new ClienteRController();
		switch (opcao) {
		case 1:
			clienteController.cadastrarCliente();
			break;

		case 2:
			clienteController.atualizarCliente();
			break;

		case 3:
			clienteController.excluirCliente();
			break;
		case 4:
			clienteController.consultarClientes();
			break;
		default:
			System.out.println("\nOpção inválida.");
		}

	}

}
