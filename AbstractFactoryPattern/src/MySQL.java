import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL extends DBConnection{
	
	private String database = "Persona.sql";
	private String us = "root";
	private String pass = "";
	private String url = "jdbc:mysql://localhost:3306/"+database;
	private Connection connection = null;
	private String dataBaseType= "MySQL";
	
	
	public MySQL(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection= (Connection)DriverManager.getConnection(url, us, pass);
			System.out.println("Conneted to MySQL database "+url);
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
