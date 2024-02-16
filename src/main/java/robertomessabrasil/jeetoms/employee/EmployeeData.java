package robertomessabrasil.jeetoms.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "employeeData", eager = true)
public class EmployeeData {

	public List<Employee> getEmployees() throws ClassNotFoundException {
		ResultSet rs = null;
		PreparedStatement pst = null;
		Connection con = getConnection();
		String stm = "Select * from employee";
		List<Employee> records = new ArrayList<>();

		try {
			pst = con.prepareStatement(stm);
			pst.execute();
			rs = pst.getResultSet();

			while (rs.next()) {
				Employee employee = new Employee();
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				records.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return records;
	}

	public Connection getConnection() throws ClassNotFoundException {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/edu";
		String user = "root";
		String password = "root";

		try {
			System.out.println("Trying to get connection...");
			Class.forName("com.mysql.jdbc.Driver");  
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection completed.");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		finally {
		}
		return con;
	}

}