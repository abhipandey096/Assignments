package demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.mysql.cj.protocol.Resultset;

@SuppressWarnings("unused")
public class addBook {
	public static void main(String[] args)  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PreparedStatement stmt=null;
		Connection connection=null;
		try {
			 connection= DriverManager.getConnection
					("jdbc:mysql://localhost:3306/book","root","Sharda@276");
		
			stmt=connection.prepareStatement("insert into boo(id,title,author,price) values(?,?,?,?");
			stmt.setInt(1,333);
			stmt.setString(2, "MyExperimentWithTruth");
			stmt.setString(3, "MahatmaGandhi");
			stmt.setDouble(4, 324);
			int noOfRowsEffected=stmt.executeUpdate();
			System.out.println(noOfRowsEffected);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}


