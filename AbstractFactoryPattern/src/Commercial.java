
public class Commercial extends DBTypeConnection {

	public DBConnection getConnection (String type){
		if ("oracle".equals(type))
			return new Oracle();
		else
			return new SQLServer();
	}
	
}
