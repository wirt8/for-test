package copy.data;

import java.sql.Connection;
import java.sql.SQLException;

public class QueryExample {
	public static void main(String[] args) throws SQLException {
		Connection conn = ConnectionUtils.getMyConnection();

//		UpdateData.insert("12211", "1112");
		conn.close();
	}
}
