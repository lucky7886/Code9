package guiLaunching;
import javax.swing.JOptionPane;
public class Gui_5 {

	public static void main(String[] args) {

int first = Integer.parseInt(JOptionPane.showInputDialog("enter first number"));
int second = Integer.parseInt(JOptionPane.showInputDialog("enter second number"));
int sum = first+second;
String message = String.format("The sum is %d!",sum);

JOptionPane.showMessageDialog(null, message);
	}

}
