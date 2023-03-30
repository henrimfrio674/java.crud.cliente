package controllers;

import java.util.Scanner;

import entities.Clientes;
import repositories.ClienteRepository;

public class ClienteRController {

	public void cadastrarCliente() {

		System.out.println("\n*** CADASTRO DE CLIENTES ***\n");
		Scanner scanner = new Scanner(System.in);

		Clientes cliente = new Clientes();

		System.out.print("NOME DO CLIENTE....: ");
		cliente.setNome(scanner.nextLine());

		System.out.print("EMAIL..............: ");
		cliente.setEmail(scanner.nextLine());

		System.out.print("TELEFONE...........: ");
		cliente.setTelefone(scanner.nextLine());

		System.out.print("CPF................: ");
		cliente.setCpf(scanner.nextLine());

		ClienteRepository clienteRepository = new ClienteRepository();

		try {

			clienteRepository.create(cliente);
			System.out.println("\nCLIENTE CADASTRADO COM SUCESSO!");

		} catch (Exception e) {
			System.out.println("\nFALHA AO CADASTRAR CLIENTE!");
			e.printStackTrace(); // imprimir log do erro
		}
	}
}



