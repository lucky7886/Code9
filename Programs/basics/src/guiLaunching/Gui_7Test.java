package guiLaunching;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Gui_7Test {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Enter 1 to draw rectangles\n" + "Enter 2 to draw ovals");
		int choice = Integer.parseInt(input);
		
		Gui_7 panel = new Gui_7(choice);
		
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(500,500);
		application.setVisible(true);
		
		
	}

}
