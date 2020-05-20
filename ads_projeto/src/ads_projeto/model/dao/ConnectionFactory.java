package ads_projeto.model.dao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public static Connection getConnection() throws IOException {
		try {
			//Alterara o 'user' e o 'password' de acordo com o seu banco
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseprojeto?"
					+ "useTimezone=true&serverTimezone=UTC&user=root&password=123456");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new IOException(e);
		}
	}

}

