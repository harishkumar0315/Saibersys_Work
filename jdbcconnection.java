import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String host = "localhost";
		String port = "3306";
				
		Connection c = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/qa", "root", "hpayila");
		
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from Employeeinfo where name = 'sam'");
		
		while(rs.next())
		{
		System.out.println(rs.getString("name"));
		System.out.println(rs.getInt("id"));
		}
	}

}
