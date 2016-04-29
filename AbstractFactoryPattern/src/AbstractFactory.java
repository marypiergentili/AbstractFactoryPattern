
public class AbstractFactory {
	
	public DBTypeConnection getDBConnectionFactory (String type){
		if ("commercial".equals(type))
			return new Commercial();
		else 
			return new OpenSource();
	}

}
