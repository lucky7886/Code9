package GuiInAbundance;
import javax.swing.JOptionPane;
public class Gui5 {

	public static void main(String[] args) {

		String b = JOptionPane.showInputDialog("what is your name?");
		String message = String.format("welcome %s to java programming",b);
		JOptionPane.showMessageDialog(null,message);
		
	}

}
