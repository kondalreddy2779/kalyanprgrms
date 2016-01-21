package selenium.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDemo {
	public static void main(String args[]) throws ClassNotFoundException, SQLException{
		String dbUrl = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String password = "root";
		String query = "select *  from emp;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl,username,password);
		Statement stmt = con.createStatement();
		ResultSet rs= stmt.executeQuery(query);
		System.out.println("Thnis is while loop");
		while (rs.next()){
    		String myName = rs.getString(1);								        
            String myAge = rs.getString(2);					                               
            System. out.println(myName+"  "+myAge);		
		}
		con.close();
	}
	
}
