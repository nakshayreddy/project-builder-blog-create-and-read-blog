package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager{
	public static Connection getConnection() throws Exception {
		
		Properties p=loadPropertiesFile();
		String d=p.getProperty("driver");
		String url=p.getProperty("url");
		String user=p.getProperty("username");
		String pass=p.getProperty("password");
		Class.forName(d);
		Connection con=null;
 	con=DriverManager.getConnection(url,user,pass);
		return con;
	}

	public static Properties loadPropertiesFile() throws Exception
	{
		Properties prop = new Properties();	
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close(); 
		return prop;
		
	}
}
