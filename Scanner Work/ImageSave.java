import java.sql.*;
import java.io.*;
class ImageSave
{
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");

			String sql = "insert into images(pic) values(?)";

			PreparedStatement pst = con.prepareStatement(sql);

			FileInputStream fis = new FileInputStream("C:\Users\Sanjay Kumar\Desktop\New folder");

			pst.setBinaryStream(1,fis,fis.available());
			pst.executeUpdate();

			System.out.println("done......");


		}catch(Exception e) {
			e.printStackTrace();

			System.out.println("Error....");
		}
	}



}