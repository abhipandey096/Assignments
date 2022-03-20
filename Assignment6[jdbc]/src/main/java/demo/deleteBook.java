package demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.mysql.cj.protocol.Resultset;

public class deleteBook {
	public static void main(String[] args)  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PreparedStatement stmt=null;
	   
		
		try {
			Connection connection= DriverManager.getConnection
					("jdbc:mysql://localhost:3306/book","root","Sharda@276");
			stmt=connection.prepareStatement("delete from boo where id ?");
			
			
			stmt.setInt(1, 111);
			int noOfRowsEffected=stmt.executeUpdate();
			System.out.println(noOfRowsEffected);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		}
	}


