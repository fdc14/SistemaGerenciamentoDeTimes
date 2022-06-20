package fuctura.aplicacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fuctura.model.Jogador;
import fuctura.repositorio.JogadorRepositorio;
import fuctura.util.Conexao;

public class TesteConexaoJDBC {

	public static void main(String[] args) {
		
			Conexao c = new Conexao();
			Connection conexao = c.getConnection();
		

			Jogador j = new Jogador();
			j.setCod(12);
			//j.setNome("NomeTeste8");
			//j.setAltura(1.1);
			j.setPeso(76);
			j.setIdade(29);
			
		JogadorRepositorio repositorio = new JogadorRepositorio();
//			repositorio.inserir(conexao, j);
		
		repositorio.atualizar(conexao, j);
		
		//repositorio.deletar(conexao, j);

		//	System.out.println("jogador inserido com sucesso");
			
//			ArrayList<Jogador> resultadoConsulta = repositorio.listarTodos(conexao);	
//			System.out.println("Quantidade jogadores encontrados: " + resultadoConsulta.size());
//
//			System.out.println("_______________________________________________________________");
//			
//			ArrayList<Jogador> resultadoConsultaMaiorDe18 = repositorio.listarJogadoresMaioresDe18(conexao);
//			System.out.println("Quantidade jogadores encontrados: " + resultadoConsultaMaiorDe18.size());

		

	}



	
}
