package jdbcProject;
import java.sql.*;
public class demo1 {

	public static void main(String[] args) {

		
		try{
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test5","root","prateek590");
			Statement myStmt = myConn.createStatement();
			//ResultSet myRs = myStmt.executeQuery("select * from persons");
			//while(myRs.next()){
				//System.out.println(myRs.getString("PersonId")+", "+myRs.getString("Lastname")+", "+myRs.getString("salary")+", "+myRs.getString("Address"));
			//}
			//String sql = "insert into persons values (1,'gupta','karnataka',4574857,'Bangalore')";
	//String sql = "update persons set salary = 100000 where PersonId=4";
	//String sql = "delete from persons where lastname = 'narain'";
			//myStmt.executeUpdate(sql);
			System.out.println("Insert Complete");
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
		
	}

}
