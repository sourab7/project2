package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;
/*
1) create connection
2) create statement
3) execute statement
4) close connection

*/
public class Another_DB {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver ="com.mysql.jdbc.Driver";
		String url= "jdbc:mysql://localhost:3000/first_db";
		String username="root";
		String password="roottoor";
		Class.forName(driver);
		Connection con= DriverManager.getConnection(url, username, password );
		System.out.println("connected sccsflly");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter name");
		String sname=sc.nextLine();
		System.out.println("enter phone");
		String phone= sc.nextLine();
		
		PreparedStatement ps=con.prepareStatement("insert into rox (name,phone) values('"+sname+"','"+phone+"')");
		ps.executeUpdate();
		System.out.println("inserted data");

	}

}
