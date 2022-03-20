package demo;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class ShowAllJdbc {

		public static void main(String[] args) {
			//1. u need to load the driver
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("driver is loaded..");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			
			Statement stmt=null;
			ResultSet rs=null;
			Connection connection=null;
			
			try {
				 connection=DriverManager.getConnection
						("jdbc:mysql://localhost:3306/book", "root", "Sharda@276");
				
				stmt=connection.createStatement();
				rs=stmt.executeQuery("select * from boo");			
				
				while(rs.next()) {
					System.out.println(rs.getInt("id"));
					System.out.println(rs.getString("title"));
					System.out.println(rs.getString("author"));
					System.out.println(rs.getInt("price"));
				}
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
	

