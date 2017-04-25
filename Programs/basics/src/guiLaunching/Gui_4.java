package guiLaunching;
import javax.swing.JOptionPane;
public class Gui_4 {

	public static void main(String[] args) {

	String name	= JOptionPane.showInputDialog("what is your name?");
		
	 
String message = String.format("Welcome, %s, to Java Programming!",name);

JOptionPane.showMessageDialog(null, message);
	}

}
