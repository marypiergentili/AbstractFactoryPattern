
public class OpenSource extends DBTypeConnection {
	
	public DBConnection getConnection(String type){
		if ("mysql".equals(type))
			return new MySQL();
		else
			return new SQLite();
	}

}
