package fuctura.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Conexao {
	
	public Connection getConnection() {
		
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String usuario = "fabio";
	String senha = "123";
	
	try {
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		return conexao;
	}catch (Exception e) {
		System.out.println("Falha na conexão");
		e.printStackTrace();
		
		}
	
		return null;
	}

	

}
