package model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.entity.Pessoa;



public class PessoaDAO {
	
	public Pessoa salvarPessoaDAO(Pessoa pessoa) {
		String query = "INSERT INTO pessoa (idPessoa, nome, dataNascimento, sexo, cpf) VALUES (?, ?, ?, ?, ?)";
		Connection conn = Banco.getConnection();
		PreparedStatement pstmt = Banco.getPreparedStatementWithPk(conn, query);
		try {
			pstmt.setInt(1, pessoa.getIdPessoa());
			pstmt.setString(2, pessoa.getNome());
			pstmt.setObject(3, pessoa.getDataNascimento());
			pstmt.setLong(4, pessoa.getSexo());
			pstmt.setString(5, pessoa.getCpf());
			pstmt.execute();
			ResultSet resultado = pstmt.getGeneratedKeys();
			if(resultado.next()) {
				pessoa.setIdPessoa(resultado.getInt(1));
			}
		} catch (SQLException erro) {
			System.out.println("Erro ao executar a query do método cadastrarPessoa!");
			System.out.println("Erro: " + erro.getMessage());
		} finally {
			Banco.closeStatement(pstmt);
			Banco.closeConnection(conn);
		}
		return pessoa;
		
		
	}

	public List<Pessoa> consultarTodasPessoasDAO(int idPessoa) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		
		ResultSet resultado = null;
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
		String query = "SELECT idpessoa, nome, dataNascimento, sexo, cpf "
				+ "FROM pessoa WHERE idpessoa = " + idPessoa;

		try{
			resultado = stmt.executeQuery(query);
			while(resultado.next()){
				Pessoa pessoa = new Pessoa();
				pessoa.setIdPessoa(Integer.parseInt(resultado.getString(1)));
				pessoa.setNome(resultado.getString(2));
				pessoa.setDataNascimento(resultado.getDate(3));
				pessoa.setSexo(resultado.getString(4).charAt(4));
				pessoa.setCpf(resultado.getString(5));
				
				listaPessoas.add(pessoa);
			}
		} catch (SQLException erro){
			System.out.println("Erro ao executar a query do método consultarTodasPessoa!");
			System.out.println("Erro: " + erro.getMessage());
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return listaPessoas;
	}
	
	public boolean atualizarPessoaDAO(Pessoa pessoa) {
	    Connection conn = null;
	    PreparedStatement stmt = null;
	    ResultSet resultado = null;
	    boolean cpfExiste = false;

	    try {
	        conn = Banco.getConnection();
	        
	        // Verifica se o CPF já existe na tabela pessoa
	        String sql = "SELECT COUNT(*) FROM pessoa WHERE cpf = ?";
	        stmt = conn.prepareStatement(sql);
	        stmt.setString(1, pessoa.getCpf());
	        resultado = stmt.executeQuery();
	        
	        if (resultado.next()) {
	            int count = resultado.getInt(1);
	            if (count > 0) {
	                cpfExiste = true;
	            }
	        }

	    } catch (SQLException erro) {
	        System.out.println("Erro ao executar a query do método atualizarPessoaDAO!");
	        System.out.println("Erro: " + erro.getMessage());
	    } finally {
	        Banco.closeResultSet(resultado);
	        Banco.closeStatement(stmt);
	        Banco.closeConnection(conn);
	    }
	    
	    return cpfExiste;
	}


	public boolean excluirPessoaDAO(Pessoa pessoa) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		boolean retorno = false;
		String query = "DELETE FROM pessoa WHERE idpessoa = " + pessoa.getIdPessoa();
		try {
			if(stmt.executeUpdate(query) == 1) {
				retorno = true;
			}
		} catch (SQLException erro) {
			System.out.println("Erro ao executar a query do método excluirPessoaDAO!");
			System.out.println("Erro: " + erro.getMessage());
		} finally {
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return retorno;
	}
	

}
