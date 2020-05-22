package ads_projeto.model.dao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ads_projeto.model.entity.Usuario;

public class UsuarioDAO {
	public boolean validar(Usuario usuario) {
		String sqlSelect = "SELECT username, password FROM usuario "
				+ "WHERE username = ? and password = ?";
		// pega a conex�o em um try normal para que ela n�o seja fechada
		try {
			Connection conn = ConnectionFactory.getConnection();
			// usando o try with resources do Java 7, que fecha o que abriu
			try (PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
				stm.setString(1, usuario.getUsername());
				stm.setString(2, usuario.getPassword());
				try (ResultSet rs = stm.executeQuery();) {
					if (rs.next()) {
						return true;
					} else {
						return false;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (SQLException e1) {
				System.out.print(e1.getStackTrace());
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return false;
	}
}