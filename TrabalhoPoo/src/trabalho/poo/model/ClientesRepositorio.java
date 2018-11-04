package trabalho.poo.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import trabalho.poo.controller.Clientes;

public class ClientesRepositorio {
	
	private Connection connection;
		
		public ClientesRepositorio() throws SQLException {
			this.connection = ConnectionFactory.getConnection();
		}
		
		public void insere(Clientes clientes) throws SQLException {
			PreparedStatement pstm = this.connection.prepareStatement
					("INSERT INTO CLIENTES() VALUES()");
			
//			pstm.setString();
//			pstm.setString();
//			pstm.executeUpdate();
			pstm.close();
			
		}

}
