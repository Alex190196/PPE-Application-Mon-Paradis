package APP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbc {
	
    Connection con;
    
    public dbc() {
    	
    }
    public Connection db_connect() throws SQLException, ClassNotFoundException{
    	Class.forName("com.mysql.jdbc.Driver");
    	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb?autoReconnect=true&useSSL=false", "root", "");
        
    	return con;
    }
    public void close_connect()throws SQLException{
    	con.close();
    }
}  