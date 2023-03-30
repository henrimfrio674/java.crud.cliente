package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;

import entities.Clientes;
import factories.ConectionFactory;

public class ClienteRepository {

	//m�todo para receber e cadastrar um cliente no banco de dados
	public void create(Clientes cliente) throws Exception {
		
		//abrindo conex�o com o banco de dados
		ConectionFactory connectionFactory = new ConectionFactory();
		Connection connection = connectionFactory.getConnection();
		
		//escrevendo um comando em linguagem SQL para inserir um cliente no banco de dados
		PreparedStatement statement = connection.prepareStatement("insert into cliente(nome, email, telefone, cpf) values(?,?,?,?)");
		statement.setString(1, cliente.getNome());
		statement.setString(2, cliente.getEmail());
		statement.setString(3, cliente.getTelefone());
		statement.setString(4, cliente.getCpf());
		statement.execute();
		
		//fechando a conex�o
		connection.close();
	}		
}



