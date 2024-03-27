package model.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.mysql.jdbc.Connection;

import model.entity.Pessoa;
import model.entity.Vacina;
import model.repository.banco.Banco;
import model.repository.banco.BaseRepository;

public class VacinaRepository implements BaseRepository<Vacina>{
	
	@Override
	public Vacina salvar(Vacina novaVacina) {
		String sql = " INSERT INTO vacina(id_pesquisador, nome, pais, estagio_pesquisa, data_inicio_pesquisa) "
				   + " VALUES(?, ?, ?, ?, ?) ";
		Connection conexao =  (Connection) Banco.getConnection();
		PreparedStatement stmt = Banco.getPreparedStatementWithPk(conexao, sql);
		
		try {
	        stmt.setInt(1, novaVacina.getPesquisadorResponsavel().getIdPessoa());
			stmt.setString(2, novaVacina.getNomeVacina());
			stmt.setInt(3, novaVacina.getPais().getIdPais());
			stmt.setInt(4, novaVacina.getEstagio());
            stmt.setDate(5, java.sql.Date.valueOf(novaVacina.getDataInicioPesquisa()));
   
			stmt.execute();
			ResultSet resultado = stmt.getGeneratedKeys();
			if(resultado.next()) {
				novaVacina.setIdVacina(resultado.getInt(1));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao salvar nova vacina");
			System.out.println("Erro: " + e.getMessage());
		}
		
		return novaVacina;
	}

	@Override
	public boolean excluir(int idVacina) {
		//com.mysql.jdbc.Connection conexao = null;

		Connection conn = (Connection) Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		boolean excluiu = false;
		String query = "DELETE FROM vacina WHERE id = " + idVacina;
		try {
			if(stmt.executeUpdate(query) == 1) {
				excluiu = true;
			}
		} catch (SQLException erro) {
			System.out.println("Erro ao excluir vacina");
			System.out.println("Erro: " + erro.getMessage());
		} finally {
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return excluiu;
	}

	@Override
	public boolean alterar(Vacina vacinaEditada) {
		boolean alterou = false;
		String query = " UPDATE vacina "
				     + " SET id_pesquisador=?, nome=?, pais=?, estagio_pesquisa=?, data_inicio_pesquisa=? "
				     + " WHERE id=? ";
		Connection conn = (Connection) Banco.getConnection();
		PreparedStatement stmt = Banco.getPreparedStatementWithPk(conn, query);
		try {
			stmt.setInt(1, vacinaEditada.getPesquisadorResponsavel().getIdPessoa());
			stmt.setString(2, vacinaEditada.getNomeVacina());
			stmt.setInt(3, vacinaEditada.getPais().getIdPais());
			stmt.setInt(4, vacinaEditada.getEstagio());
			stmt.setDate(5, java.sql.Date.valueOf (vacinaEditada.getDataInicioPesquisa()));
			stmt.setInt(6, vacinaEditada.getIdVacina());
			alterou = stmt.executeUpdate() > 0;
			
		} catch (SQLException erro) {
			System.out.println("Erro ao atualizar vacina");
			System.out.println("Erro: " + erro.getMessage());
		} finally {
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return alterou;
	}

	@Override
	public Vacina consultarPorId(int idVacina) {
		Connection conn = (Connection) Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		
		Vacina vacina = null;
		ResultSet resultado = null;
		String query = " SELECT * FROM vacina WHERE id = " + idVacina;
		
		try{
			resultado = stmt.executeQuery(query);
			PessoaRepository pessoaRepository = new PessoaRepository();
			if(resultado.next()){
				vacina = new Vacina();
				vacina.setIdVacina(Integer.parseInt(resultado.getString("ID")));
				vacina.setNomeVacina(resultado.getString("NOME"));
				
				PaisRepository paisRepository = new PaisRepository();
				vacina.setPais(paisRepository.consultarPorId(resultado.getInt("ID_PAIS")));
				vacina.setEstagio(resultado.getInt("ESTAGIO_PESQUISA"));
				vacina.setDataInicioPesquisa(resultado.getDate("DATA_INICIO_PESQUISA").toLocalDate()); 
				Pessoa pesquisador = pessoaRepository.consultarPorId(resultado.getInt("ID_PESQUISADOR"));
				vacina.setPesquisadorResponsavel(pesquisador);
			}
		} catch (SQLException erro){
			System.out.println("Erro ao consultar vacina com o id: " + idVacina);
			System.out.println("Erro: " + erro.getMessage());
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return vacina;
	}

	@Override
	public ArrayList<Vacina> consultarTodos() {
		ArrayList<Vacina> vacinas = new ArrayList<>();
		Connection conn = (Connection) Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		
		ResultSet resultado = null;
		String query = " SELECT * FROM vacina";
		
		try{
			resultado = stmt.executeQuery(query);
			PessoaRepository pessoaRepository = new PessoaRepository();
			while(resultado.next()){
				Vacina vacina = new Vacina();
				vacina.setIdVacina(Integer.parseInt(resultado.getString("ID")));
				vacina.setNomeVacina(resultado.getString("NOME"));
				
				PaisRepository paisRepository = new PaisRepository();
				vacina.setPais(paisRepository.consultarPorId(resultado.getInt("ID_PAIS")));
				vacina.setEstagio(resultado.getInt("ESTAGIO_PESQUISA"));
				vacina.setDataInicioPesquisa(resultado.getDate("DATA_INICIO_PESQUISA").toLocalDate()); 
				Pessoa pesquisador = pessoaRepository.consultarPorId(resultado.getInt("ID_PESQUISADOR"));
				vacina.setPesquisadorResponsavel(pesquisador);
				vacinas.add(vacina);
			}
		} catch (SQLException erro){
			System.out.println("Erro ao consultar todas as vacinas");
			System.out.println("Erro: " + erro.getMessage());
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return vacinas;
	}
	

}
