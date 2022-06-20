package fuctura.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fuctura.model.Jogador;

public class JogadorRepositorio {

	// Inserir

	public void inserir(Connection conexao, Jogador j) {
		try {
			String comandoSql = "INSERT INTO jogador VALUES (?,?,?,?,?)";
			PreparedStatement pstmt = conexao.prepareStatement(comandoSql);
				pstmt.setInt(1, j.getCod());
				pstmt.setString(2, j.getNome());
				pstmt.setInt(3, j.getIdade());
				pstmt.setDouble(4, j.getAltura());
				pstmt.setDouble(5, j.getPeso());
					pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// Listar

	public ArrayList<Jogador> listarTodos(Connection conexao) {
		ArrayList<Jogador> resultadoConsulta = new ArrayList<>();
		try {
			String comandoSql = "SELECT * FROM jogador";
			PreparedStatement pstm = conexao.prepareStatement(comandoSql);
				ResultSet resultado = pstm.executeQuery();

					while (resultado.next()) {
						int codigo = resultado.getInt(1);
						String nome = resultado.getString(2);
						double altura = resultado.getDouble(4);
						double peso = resultado.getDouble(5);
						int idade = resultado.getInt(3);
						System.out.println("Código: " + codigo);
						System.out.println("Nome: " + nome);
						System.out.println("Altura: " + altura);
						System.out.println("Peso: " + peso);
						System.out.println("Idade: " + idade);

							Jogador j = new Jogador();
							j.setCod(codigo);
							j.setNome(nome);
							j.setPeso(peso);
							j.setAltura(altura);
							j.setIdade(idade);

								resultadoConsulta.add(j);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Nao foi possivel listar todos");
		}

		return resultadoConsulta;
	}

	public ArrayList<Jogador> listarJogadoresMaioresDe18(Connection conexao) {
		ArrayList<Jogador> resultadoConsulta = new ArrayList<Jogador>();

		try {
			String comandoSql = "select * from jogador where idade > 18";
			PreparedStatement pstm = conexao.prepareStatement(comandoSql);
			ResultSet resultado = pstm.executeQuery();// Query = consulta

				while (resultado.next()) {
					int codigo = resultado.getInt(1); // codigo
					String nome = resultado.getString(2);
					double altura = resultado.getDouble(4);
					double peso = resultado.getDouble(5);
					int idade = resultado.getInt(3);

						System.out.println("Código: " + codigo);
						System.out.println("Nome: " + nome);
						System.out.println("Altura: " + altura);
						System.out.println("Peso: " + peso);
						System.out.println("Idade: " + idade);

							Jogador j = new Jogador();
							j.setCod(codigo);
							j.setNome(nome);
							j.setPeso(peso);
							j.setAltura(altura);
							j.setIdade(idade);

				resultadoConsulta.add(j);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Nao foi possivel listar todos");
		}

		return resultadoConsulta;
	}

	// UPDATE

	public void atualizar(Connection conexao, Jogador j) {
		try {
			if (j.getNome() != null) {
				String comandoSQL = "UPDATE jogador SET nome = ?  WHERE cod =  ?";
					PreparedStatement psmt = conexao.prepareStatement(comandoSQL);
					psmt.setString(1, j.getNome());
					psmt.setInt(2, j.getCod());
						psmt.executeUpdate();
							System.out.println("NOME ATUALIZADO");
			}
			if (j.getIdade() != 0) {
				String comandoSQL = "UPDATE jogador SET idade = ? WHERE cod =  ?";
					PreparedStatement psmt = conexao.prepareStatement(comandoSQL);
					psmt.setInt(1, j.getIdade());
					psmt.setInt(2, j.getCod());
						psmt.executeUpdate();
							System.out.println("IDADE ATUALIZADA");
			}
			if (j.getAltura() != 0.0) {
				String comandoSQL = "UPDATE jogador SET altura = ? WHERE cod =  ?";
					PreparedStatement psmt = conexao.prepareStatement(comandoSQL);
					psmt.setDouble(1, j.getAltura());
					psmt.setInt(2, j.getCod());
						psmt.executeUpdate();
							System.out.println("ALTURA ATUALIZADA");
			}
			if (j.getPeso() != 0.0) {
				String comandoSQL = "UPDATE jogador SET peso = ? WHERE cod =  ?";
					PreparedStatement psmt = conexao.prepareStatement(comandoSQL);
					psmt.setDouble(1, j.getPeso());
					psmt.setInt(2, j.getCod());
						psmt.executeUpdate();
							System.out.println("PESO ATUALIZADO");
				} 
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	//DELETAR
	
	public void deletar(Connection conexao, Jogador j) {
		try {
			String comandoSQL = "DELETE FROM jogador WHERE cod = ?";
			PreparedStatement psmt = conexao.prepareStatement(comandoSQL);

				psmt.setInt(1, j.getCod());

					psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Linha daletada!!!");
	}

}
