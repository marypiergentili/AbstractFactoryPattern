import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServer extends DBConnection{
	
	private String database = ":databaseName=Persona";
	private String us = "root";
	private String pass = "";
	private String url = "jdbc:microsoft:sqlserver://localhost:1433"+database;
	private Connection connection = null;
	private String dataBaseType = "SQL Server";
	
	public SQLServer(){
		try{
			Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
			connection= (Connection)DriverManager.getConnection(url, us, pass);
			System.out.println("Conneted to SQL Server database "+url);
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
