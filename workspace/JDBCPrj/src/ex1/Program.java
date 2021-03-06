package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		String url ="jdbc:oracle:thin:@localhost:1521/xepdb1";
		String sql ="SELECT * FROM NOTICE";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "newlec", "wktls");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		if(rs.next()) {
			String title = rs.getString("TITLE");
			System.out.printf("NAME: %s\n", title);
		}
		
		
		
		
		
		rs.close();
		st.close();
		con.close();
	}

}
