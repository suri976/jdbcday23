package jdbcday23;
import java.sql.*;


public class Connections {
//""
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String url="jdbc:mysql://localhost:3306/world";
		//jdbc:mysql://localhost:3306/world
		String username="root";
	    String password= "Password@123";
	    
	    try {
			Connection con = DriverManager.getConnection(url, username, password);
			//System.out.println(con);
			//Statement st =con.createStatement();
			String selectsql = "select * from customer";
			Statement st1 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			
			ResultSet rs = st1.executeQuery(selectsql);
			
			
			
			
			
			while(rs.next())
			{
//				rs.afterLast();// enter which record to see for to go fourth record
//				
//            	rs.previous();
//            	System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
               //rs.first();
                System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
				
//                rs.next();
//                System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
                
                //rs.absolute(4);// with reference with first record
               // System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
				//rs.next();
				
				
//				
			}
			
			
//			rs.afterLast();
//			while(rs.previous()) {
//			   System.out.println(rs.getString(1));
//			   System.out.println(rs.getString(2));
//			}
//			//System.out.println(con);
			
			
			
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    

	}

}
