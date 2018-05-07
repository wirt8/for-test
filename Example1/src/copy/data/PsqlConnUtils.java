package copy.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PsqlConnUtils {
	public Connection getPsqlConnection() throws SQLException, ClassNotFoundException {
		System.err.println("PsqlConnUtils");
		String url = "jdbc:postgresql://localhost/postgres";
		String username = "postgres";
		String password = "1111";
		return getPsqlConnection(url, username, password);
	}
	public Connection getPsqlConnection(String url, String username, String password) throws SQLException, ClassNotFoundException {
		System.err.println("Connection 1");
		Class.forName("org.postgresql.Driver");		
		Connection connection = DriverManager.getConnection(url, username, password);
		System.err.println("Connection");
		System.err.println(connection);
		return connection;
	}
}
