import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLite extends DBConnection{
	
	private String database = "persona.db";
	private String url = "jdbc:sqlite:"+database;
	private Connection connection = null;
	private String dataBaseType = "SQLite";
	
	public SQLite(){
		try{
			Class.forName("org.sqlite.JDBC");
			connection= (Connection)DriverManager.getConnection(url);
			System.out.println("Conneted to SQLite database "+url);
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
