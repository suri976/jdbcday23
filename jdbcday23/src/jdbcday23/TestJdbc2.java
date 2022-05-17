package jdbcday23;
import java.sql.*;
public class TestJdbc2 {
	public static void main(String[] args) throws Exception {
		String userName="root";
	      String url="jdbc:mysql://localhost:3306/world";
	      String password="Password@123";
		// jdbc:mysql://localhost::3306/	
		
	    //""		
				Connection con= DriverManager.getConnection(url, userName, password);
				
		DatabaseMetaData dmd= con.getMetaData();
		System.out.println(dmd.getDriverMajorVersion());
		System.out.println(dmd.getDriverName());
		System.out.println(dmd.getDriverName());
		System.out.println(dmd.getDriverMajorVersion());
		
		
		
		
	}
	
	
	
	

}
