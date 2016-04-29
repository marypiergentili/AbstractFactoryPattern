import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Oracle extends DBConnection {
	
	private String database = "persona";
	private String us = "root";
	private String pass = "";
	private String url = "jdbc:oracle:thin:@localhost:3306:"+database;
	private Connection connection = null;
	private String dataBaseType = "Oracle";
	
	public Oracle(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection= (Connection)DriverManager.getConnection(url, us, pass);
			System.out.println("Conneted to Oracle database "+url);
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	public String getDBType(){
		return dataBaseType;
	}
}
