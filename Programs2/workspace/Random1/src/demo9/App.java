package demo9;

public class App {

	
	public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

	public static String[][] drivers = { { "Fred", "Sue", "Pete" }, { "Sue", "Richard", "Bob", "Fred" },
			{ "Pete", "Mary", "Bob" } };
	
	public static void main(String[] args) {
	/*	
		for (int i = 0; i < vehicles.length; i++) {
			String vehicle = vehicles[i];
			String[] driversList = drivers[i];
	}
*/
		
		String[] driverList = drivers[1];
		for(int i=0;i<drivers[1].length;i++)
		System.out.println(driverList[i]);
		
	}
}
