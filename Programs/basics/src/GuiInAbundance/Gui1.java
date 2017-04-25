package GuiInAbundance;
import javax.swing.JOptionPane;
public class Gui1 {

	public static void main(String[] args) {

		String f1 = JOptionPane.showInputDialog("Enter first number");
		String f2 = JOptionPane.showInputDialog("Enter second number");
		
		int num1 = Integer.parseInt(f1);
		int num2 = Integer.parseInt(f2);
		int sum=num1+num2;
		
	 JOptionPane.showMessageDialog(null,"The answer is "+sum,"the title",
				JOptionPane.PLAIN_MESSAGE);
	}

}
