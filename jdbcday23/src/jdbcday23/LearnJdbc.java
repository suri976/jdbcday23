package jdbcday23;
import java.sql.*;

public class LearnJdbc {
    // connect
	// send and retreive the select statement
	//dml
	//get information from database 
	//resultset
	
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String userName="root";
	      String url="jdbc:mysql://localhost:3306/world";
	      String password="Password@123";
	    //""
	      // 1. establish connection 
		Connection connection =DriverManager.getConnection(url, userName, password);
		//2. create statement using the connect object
		Statement  st= connection.createStatement();
		
		// query in a string format
		String query = "select * from customer";
		
		//3.execute the query and store it in a result
		ResultSet rs = st.executeQuery(query);
		
		//4.process the result set object
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" :: "+rs.getString(2)+" :: "+ rs.getString(3));
		}
		
         }

}
