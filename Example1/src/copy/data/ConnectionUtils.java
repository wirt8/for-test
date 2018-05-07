package copy.data;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtils {
	public static Connection getMyConnection() throws SQLException {
		System.err.println("ConnectionUtils");
		return (new PsqlConnUtils()).getPsqlConnection();
	}
}
