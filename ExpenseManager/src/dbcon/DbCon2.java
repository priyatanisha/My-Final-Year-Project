package dbcon;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbCon2 {
	static Connection con;
	
	public static Connection getConnected() {
		try{
			Class.forName("oracle.jdbc.OracleDriver");
                        
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","rohit","12345");
                        
		
		
		}
		catch(Exception e){e.printStackTrace();}
		return con;
	}
}
