
import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//Try to get a connection to the database then create a statement and execute the SQL query and process the result
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/conushop", "root", "isY2metT");
			Statement stat = con.createStatement();
			
			
			ResultSet res = stat.executeQuery("select * from electronicitem");
			while (res.next()) {
				System.out.println(res.getString("id") + ", " + res.getString("ElectronicSpecification_id") + ", " + res.getString("serialNumber") + ", " + res.getString("User_id") + ", " + res.getString("expiryForUser"));
			}
			
			
			ResultSet res2 = stat.executeQuery("select * from electronicspecification");
			while (res2.next()) {
				System.out.println(res2.getString("id") + ", " + res2.getString("dimension") + ", " + res2.getString("weight") + ", " + res2.getString("modelNumber") + ", " + res2.getString("brandName") + ", " + res2.getString("hdSize") + ", " + res2.getString("price")
				+ ", " + res2.getString("processorType") + ", " + res2.getString("ramSize") + ", " + res2.getString("cpuCores") + ", " + res2.getString("batteryInfo") + ", " + res2.getString("os") + ", " + res2.getString("camera") + ", " + res2.getString("touchScreen")
				+ ", " + res2.getString("ElectronicType_id") + ", " + res2.getString("displaySize") + ", " + res2.getString("image"));
			}
			
			ResultSet res3 = stat.executeQuery("select * from electronictype");
			while (res3.next()) {
				System.out.println(res3.getString("id") + ", " + res3.getString("name") + ", " + res3.getString("dimensionUnit") + ", " + res3.getString("screenSizeUnit"));
			}
			
			ResultSet res4 = stat.executeQuery("select * from loginlog");
			while (res4.next()) {
				System.out.println(res4.getString("id") + ", " + res4.getString("timestamp") + ", " + res4.getString("User_id"));
			}
			
			ResultSet res5 = stat.executeQuery("select * from transaction");
			while (res5.next()) {
				System.out.println(res5.getString("id") + ", " + res5.getString("ElectronicSpecification_id") + ", " + res5.getString("item_id") + ", " + res5.getString("serialNumber") + ", " + res5.getString("timestamp") + ", " + res5.getString("customer_id"));
			}
			
			ResultSet res6 = stat.executeQuery("select * from user");
			while (res6.next()) {
				System.out.println(res6.getString("id") + ", " + res6.getString("firstName") + ", " + res6.getString("lastName") + ", " + res6.getString("email") + ", " + res6.getString("phone") + ", " + res6.getString("admin") + ", " + res6.getString("physicalAddress")
				+ ", " + res6.getString("password") + ", " + res6.getString("remember_token"));
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
