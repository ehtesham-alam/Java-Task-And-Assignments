import java.sql.*;
class FirstJDBC
{
	 public static void main(String[] args) {
		try{
			// load Driver Class:
			Class.forName("com.mysql.jdbc.Driver");

			// create connection :
			/*String url = "jdbc:mysql://localhost:3306/testdb";
			String username = "root";
			String password = "root";*/

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");

			if(con.isClosed()) {

				System.out.println("Connection...... Close");
			}
			else {
				System.out.println("Connection.....create");
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}





}