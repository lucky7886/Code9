package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseClass {

	
	public static void main(String[] args){
		
		
		
		try {
		Connection	myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/data9","root","prateek590");
			Statement myStmt = myConn.createStatement();
		
			//String sql = "insert into student value('Andy','Brennan','abrennan@aol.com','281 4th St','Jacksonville','NC',28540,'792-223-8902',\"1960-12-27\",'M',NOW(),3.5,10)";
			//String sql = "insert into class values ('English', null),('Literature',null),('Algebra',null),('Geometry',null),('Trigonometry',null),"
			//		+ "('Calculus',null),('Earth Science',null),('Biology',null),"
			//		+ "('Chemistry',null),('Physics',null),('History',null),('Art',null),('Gym',null)";
			//String sql = "update student set birth_date = \"1970-03-24\" where student_id=5";
			//String sql = "delete from class where class_id=15";
			String sql = "insert into class value ('Speech',14)";
			myStmt.executeUpdate(sql);
			System.out.println("Insert Complete");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
