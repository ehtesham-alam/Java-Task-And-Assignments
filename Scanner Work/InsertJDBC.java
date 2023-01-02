import java.sql.*;

class InsertJDBC
{
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");

			// Create Connection :

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");

			// Create Query:
			String sql = "create table table1(tid int(11) primary key auto_increment, tName varchar(200) not null, tCity varchar(200))";

			// create a statement :
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);

			System.out.println("Table create in database");

			con.close();




		}catch(Exception e) {
			e.printStackTrace();
		}
	}






}