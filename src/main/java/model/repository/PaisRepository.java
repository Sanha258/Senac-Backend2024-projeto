package model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import model.entity.Pais;
import model.repository.banco.Banco;


public class PaisRepository {

	public Pais inserir(Pais novoPais) {
		String sql = " INSERT INTO pais (nomePais, sigla) "
				   + " VALUES(?, ?) ";
		Connection conexao = Banco.getConnection();
		PreparedStatement stmt = Banco.getPreparedStatementWithPk(conexao, sql);
		
		try {
			stmt.setString(1, novoPais.getNomePais());
			stmt.setString(2, novoPais.getSigla());
			
			stmt.execute();
			ResultSet resultado = stmt.getGeneratedKeys();
			if(resultado.next()) {
				novoPais.setIdPais(resultado.getInt(1));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao inserir novo País");
			System.out.println("Erro: " + e.getMessage());
		}
		return novoPais;
	}

	
}
