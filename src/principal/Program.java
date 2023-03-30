package principal;

import controllers.ClienteRController;

public class Program {

	public static void main(String[] args) {

		ClienteRController clienteController = new ClienteRController();
		clienteController.cadastrarCliente();
	}

}



