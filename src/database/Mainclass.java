package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) throws Exception {
		
		getConnection();
		insert();

	}
	
	//sourabyadav

public static void insert() throws Exception{
	Scanner sc =new Scanner(System.in);

	System.out.print("enter ur name");
	String name=sc.nextLine();
	System.out.print("enter ur phone");
	String phone=sc.nextLine();
	try {
		Connection con =getConnection();
		PreparedStatement posted=con.prepareStatement("INSERT INTO rox (name,phone)values('"+name+"','"+phone+"')");
		posted.executeUpdate();
		
	}
	catch(Exception e){
		System.out.println(e);
	}
	finally {
		System.out.println("insert completed");
	}
}
//bawal an ta
public static Connection getConnection() throws Exception{
	try {
		String driver ="com.mysql.jdbc.Driver";
		String url= "jdbc:mysql://localhost:3000/first_db";
		String username="root";
		String password="roottoor";
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("connected");
		return con;
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return null;
}
}
//Schema=
//Table_name=
