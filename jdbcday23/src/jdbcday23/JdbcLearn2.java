package jdbcday23;
import java.sql.*;
public class JdbcLearn2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 //" "
		String userName="root";
	      String url="jdbc:mysql://localhost:3306/world";
	      String password="Password@123";
         Connection connection = DriverManager.getConnection(url, userName, password);
         //by using the statement
         Statement stobject = connection.createStatement();
         String s ="select * from customer where custid=108";
         //executequery used for the ddl operations  
         ResultSet rs = stobject.executeQuery(s);
	     while(rs.next())
	     {
	    	 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
	     }
	     
	     
	     //by using prepared statements 
	     // it is for the dynamic purpose we can send values inside the question marks as 1,2,3
	     // example 1
	     //...........
			/*
			 * PreparedStatement pstmt
			 * =connection.prepareStatement("insert into customer values (?,?,?)"); // for
			 * prepared statement we can send values using object.set methods
			 * pstmt.setInt(1,796); pstmt.setString(2,"khareem basha" ); pstmt.setDouble(3,
			 * 7960); boolean x= pstmt.execute(); // here the value is inserting even but it
			 * is printing false System.out.println(x);
			 */
	//.........
	
	     PreparedStatement pstmt1 = connection.prepareStatement("select * from customer where custid=?");
	     pstmt1.setInt(1, 796);
	     pstmt1.execute();
	    System.out.println(pstmt1);
	     
	     
	     
	     
	}

}
