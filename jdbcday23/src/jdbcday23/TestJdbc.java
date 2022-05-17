package jdbcday23;

import java.sql.*;
public class TestJdbc 
{
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	
	String url="jdbc:mysql://localhost:3306/world";
	//jdbc:mysql://localhost:3306/world
	String username="root";
    String password= "Password@123";
  //""
    try {
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pstmt =con.prepareStatement("insert into customer values (?,?,?)");
		String names[]= {"Li","Poo","Pim","Choo","Chang","Ching","Woo","Wan","Xanch","Chifu"};
		double deposits[] = {200,29,34,56,789,400,566,789,567,678};
		for(int i=1;i<names.length;i++)
		{
			PreparedStatement pstmt1 =con.prepareStatement("insert into customer values (?,?,?)");
			pstmt1.setInt(1, i+200);
			pstmt1.setString(2, names[i]);
			pstmt1.setDouble(3, deposits[i]);
			int count = pstmt1.executeUpdate();
			System.out.println(count + "record inserted");
			
		}
		
		PreparedStatement stmt=con.prepareStatement("update customer set custid=? where title=?");  
		stmt.setString(101,"surendra");//1 specifies the first parameter in the query i.e. name
		//stmt.setInt();  
		
		
//		pstmt.setInt(1, 121);
//		pstmt.setString(2, "Wang");
//		pstmt.setDouble(3, 4530);
//	
//		int count = pstmt.executeUpdate();
//		System.out.println(count + "record inserted");
		
		
		
		
		
		
		
		
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    

}

}

