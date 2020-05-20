package ads_projeto.model.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ads_projeto.model.entity.Projeto;

public class ProjetoDAO {
	public int inserirProjeto(Projeto projeto) throws IOException {
		int idProjeto = -1;
		String sql = "insert into tabelaprojeto (tituloprojeto, temaprojeto, descricaoesperada, descricaomotivacao, "
				+ "descricaoeconomica) values (?,?,?,?,?)";

		try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement pst = conn.prepareStatement(sql);) {

			pst.setString(1, projeto.getTituloProjeto());
			pst.setString(2, projeto.getTemaProjeto());
			pst.setString(3, projeto.getDescricaoEsperada());
			pst.setString(4, projeto.getDescricaoMotivacao());
			pst.setString(5, projeto.getDescricaoEconomica());
			pst.execute();

			// obter o id criado
			String query = "select LAST_INSERT_ID()";
			try (PreparedStatement pst1 = conn.prepareStatement(query); ResultSet rs = pst1.executeQuery();) {

				if (rs.next()) {
					idProjeto = rs.getInt(1);
					projeto.setIdProjeto(idProjeto);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new IOException(e);
		}
		return idProjeto;
	}

	public Projeto buscarProjeto(int idProjeto) throws IOException {
		Projeto projeto = null;
		String sql = "select p.idProjeto, tituloprojeto, temaprojeto, descricaoesperada, descricaomotivacao, "
				+ "descricaoeconomica " + "from tabelaprojeto p "
				+ "where p.tabelaprojeto = ?";

		try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement pst = conn.prepareStatement(sql);) {

			pst.setInt(1, idProjeto);
			try (ResultSet rs = pst.executeQuery();) {

				while (rs.next()) {
					projeto = new Projeto();
					projeto.setIdProjeto(idProjeto);
					projeto.setTituloProjeto(rs.getString("tituloProjeto"));
					projeto.setTemaProjeto(rs.getString("temaProjeto"));
					projeto.setDescricaoEsperada(rs.getString("descricaoesperada"));
					projeto.setDescricaoMotivacao(rs.getString("descricaomotivacao"));
					projeto.setDescricaoEconomica(rs.getString("descricaoeconomica"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new IOException(e);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new IOException(e);
		}
		return projeto;
	}

	public void excluirProjeto(int idProjeto) throws IOException {
		String sql = "delete from tabelaprojeto where idprojeto = ?";

		try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement pst = conn.prepareStatement(sql);) {

			pst.setInt(1, idProjeto);
			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new IOException(e);
		}
	}

	public ArrayList<Projeto> listarProjeto() throws IOException {
		Projeto projeto = null;
		ArrayList<Projeto> lista = new ArrayList<>();
		String sql = "select p.idprojeto, tituloprojeto, temaprojeto, descricaoesperada, descricaomotivacao, "
				+ "descricaoeconomica " + "from tabelaprojeto p "
				+ "where p.idprojeto";

		try (Connection conn = ConnectionFactory.getConnection();
				PreparedStatement pst = conn.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();) {

			while (rs.next()) {
				projeto = new Projeto();
				projeto.setIdProjeto(rs.getInt("idProjeto"));
				projeto.setTituloProjeto(rs.getString("tituloProjeto"));
				projeto.setTemaProjeto(rs.getString("temaProjeto"));
				projeto.setDescricaoEsperada(rs.getString("descricaoEsperada"));
				projeto.setDescricaoMotivacao(rs.getString("descricaoMotivacao"));
				projeto.setDescricaoEconomica(rs.getString("descricaoEconomica"));
				lista.add(projeto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new IOException(e);
		}
		return lista;
	}

	public void atualizarFilme(Projeto projeto) throws IOException {
		String sql = "update Filme set titulo=?, descricao=?, diretor=?, posterpath=?, "
				+ "popularidade=?, data_lancamento=?, id_genero=? " + "where id=?";

		try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement pst = conn.prepareStatement(sql);) {

			pst.setString(1, projeto.getTituloProjeto());
			pst.setString(2, projeto.getTemaProjeto());
			pst.setString(3, projeto.getDescricaoEsperada());
			pst.setString(4, projeto.getDescricaoMotivacao());
			pst.setString(5, projeto.getDescricaoEconomica());
			pst.setInt(6, projeto.getIdProjeto());
			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new IOException(e);
		}
	}
}
