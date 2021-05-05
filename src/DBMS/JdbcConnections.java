package DBMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnections {

	public static void main(String[] args) throws SQLException {
		
		
		
		// TODO Auto-generated method stub
		
		
		
		
		String host="localhost";
		String port="3306";
//here we are connecting to our database
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"//QADBT?useSSL=false", "root" ,"DFG@54600 ");
		//crate statment path to java to our queries
		Statement s=con.createStatement();//its build qnd through object
		//here we are triggering the quesrry
		ResultSet rs= s.executeQuery("select * from EmployeeInfo where location=\"Aundh\"");
		//
		while(rs.next())
			
		{	
			//it will point out to nect araay index
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("id"));
		}
	}

}
