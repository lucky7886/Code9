import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlClass1 {

	public static void main(String[] args) {

		
		try {
			Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/example2","root","prateek590");
		Statement s1 = c1.createStatement();
		//String sql = "insert into salesman value(5007,'Paul Adam','Rome',        0.13)";
		//s1.executeUpdate(sql);
		ResultSet rs;
		rs = s1.executeQuery("SELECT * FROM salesman");
		System.out.printf("%-15s%-20s%-15s%-10s\n","salesman_id","name","city","commission");
		 while ( rs.next() ) {
             String name = rs.getString("name");
             String id = rs.getString("salesman_id");
             String city = rs.getString("city");
             String commission=rs.getString("commission");
             System.out.printf("%-15s%-20s%-15s%-10s\n",id,name,city,commission);
             //System.out.printf("%-15s%-20s%-15s%-10s\n","",name,city,"");
		 }		
		System.out.println("Query Executed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
