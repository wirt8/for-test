package copy.servlets;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import copy.data.*;
import copy.models.Student;

/**
 * Servlet implementation class UpdateStudent
 */
public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("studentname");
		String id = request.getParameter("id");
		HttpSession session = request.getSession();
		ArrayList<Student> list = (ArrayList<Student>)session.getAttribute("students");
		list.add(new Student(name,id));
		try {	
			String url = "jdbc:postgresql://localhost/postgres";
			String username = "postgres";
			String password = "1111";
			System.err.println("1");
			Connection connection = DriverManager.getConnection(url, username, password);
			System.err.println("2");
//			UpdateData.insert(name, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher("/success.jsp").forward(request, response);
	}
	/*public static void main(String[] args) throws SQLException {
		Connection conn = ConnectionUtils.getMyConnection();

//		UpdateData.insert("12211", "1112");
		conn.close();
	}*/
}
