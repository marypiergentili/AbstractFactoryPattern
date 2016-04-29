
public class Test {
	
	public static void main (String[] arg){
		
		//testing our abstract factory
		
		AbstractFactory abstractFactory = new AbstractFactory();
		
		//creating a connection with a commercial oracle data base
		DBTypeConnection dbTypeConnection1= abstractFactory.getDBConnectionFactory("commercial");
		DBConnection dataBase1 = dbTypeConnection1.getConnection("oracle");
		System.out.println("This is an "+dataBase1.getDBType()+" data base");
		
		//creating a connection with an open source data base sqlite
		DBTypeConnection dbTypeConnection2= abstractFactory.getDBConnectionFactory("open source");
		DBConnection dataBase2 = dbTypeConnection2.getConnection("sqlite");
		System.out.println("This is an "+dataBase2.getDBType()+" data base");
		
		//creating a connection with an open source data base mysql
		DBTypeConnection dbTypeConnection3= abstractFactory.getDBConnectionFactory("open source");
		DBConnection dataBase3 = dbTypeConnection3.getConnection("mysql");
		System.out.println("This is an "+dataBase3.getDBType()+" data base");
		
		//creating a connection with a commercial data base sql server
		DBTypeConnection dbTypeConnection4= abstractFactory.getDBConnectionFactory("commercial");
		DBConnection dataBase4 = dbTypeConnection4.getConnection("sql server");
		System.out.println("This is an "+dataBase4.getDBType()+" data base");
		
	}

}
