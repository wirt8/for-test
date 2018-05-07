package copy.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
	public static void insert(String name, String id) throws SQLException {
		Connection connection = ConnectionUtils.getMyConnection();
		String sql = "Insert into student(stu_name, stu_id) values (?,?)";
		PreparedStatement pstm = connection.prepareStatement(sql);
		pstm.setString(1, name);
		pstm.setString(2, id);
		pstm.executeUpdate();
		connection.close();
	}
}
