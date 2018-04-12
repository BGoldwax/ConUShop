package shadowJdbc;

import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//create connection to db
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phpmyadmin", "admin", "isY2metT");
			
			//create statement
			Statement stat = con.createStatement();
			
			//query
			ResultSet res = stat.executeQuery("select * from users");
			
			//process result
			while (res.next()){
				System.out.println(res.getString("user"));
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
	}

}
