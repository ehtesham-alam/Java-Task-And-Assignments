// PreparedStatement : Insert
import java.sql.*;
import java.io.*;
class Fun
{
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");

			// create Connection : 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");

			// Create a query :
			String sql = "insert into table1(tName,tCity) values(?,?)";

			// Create a PreparedStatement :
			PreparedStatement pst = con.prepareStatement(sql);

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter Name : ");
			String name = br.readLine();

			System.out.println("Enter City : ");
			String city = br.readLine();

			// insert data in table : 
			pst.setString(1,name);
			pst.setString(2,city);

			pst.executeUpdate();

			System.out.println("Inserted...");
			con.close();


		}catch(Exception e) {
			e.printStackTrace();
		}
	}




}