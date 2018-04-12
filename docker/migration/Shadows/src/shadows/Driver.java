package shadows;

import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//create connection to db
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phpmyadmin", "root", "isY2metT");
			
			MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:8888"));
			
			//create statement
			Statement stat = con.createStatement();
			
			//query
			ResultSet res = stat.executeQuery("select * from pma__users");
			
			//process result
			while (res.next()){
				System.out.println(res.getString("pma__users"));
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
	}

}
