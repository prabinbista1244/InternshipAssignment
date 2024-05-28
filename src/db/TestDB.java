package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","mysql@password");
		
		//-----------------------------insert sql---------------------------------------
		
//		//a. write sql
//		String sql = "insert into user(username,password) values('bishnu', 'Bishnu@123')";
//		
//		//b. create statement
//		Statement stm = con.createStatement();
//		
//		//c. execute sql
//		stm.execute(sql);
//		
//		//d. close db
//		con.close();
//		
//		System.out.println("success");
//		
		
		
//		//------------------------------delete sql--------------------------------------------
//		String sql = "delete from user where id = 2";
//		Statement stm = con.createStatement();
//		stm.execute(sql);
//		con.close();
//		System.out.println("success");
		
		//-------------------------------update sql------------------------------------------
		
//		String sql = "update user set Password = 789 where id = 1";
//		Statement stm = con.createStatement();
//		stm.execute(sql);
//		System.out.println("Succeess");
		
		//-------------------------------select sql-------------------------------------------
		
		String sql = "select * from user where id = 3";
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println("ID = " + rs.getInt("id") + "\nusername = " + rs.getString("UserName") + "\nPassword" + rs.getString("Password") );
		}
		System.out.println("Success");
		}

}
