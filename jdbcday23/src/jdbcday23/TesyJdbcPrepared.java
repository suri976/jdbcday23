package jdbcday23;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class TesyJdbcPrepared {

	public static void main(String[] args) throws Exception {
		String userName="root";
	      String url="jdbc:mysql://localhost:3306/world";
	      String password="Password@123";
		// jdbc:mysql://localhost::3306/	
		
	    //""		
				Connection con= DriverManager.getConnection(url, userName, password);
				Statement stmt = con.createStatement();
				//update with prepared statement
//				PreparedStatement pstmt =con.prepareStatement("update customer set balance = balance+? where custid=?");        
//				pstmt.setInt(1, 110);
//				pstmt.setDouble(2, 111);
//				int count =pstmt.executeUpdate();
//				System.out.println(count + "record updated");
				
				
				PreparedStatement pstmt =con.prepareStatement("delete from customer where custid=?");
				
				pstmt.setInt(1, 110);
				
				int count =pstmt.executeUpdate();
				System.out.println(count + "record deleted");				
				
				
				
			
			
		
		
		
	}
	
	
	
}
