package guiLaunching;
import javax.swing.JFrame;
public class Gui_10Test {

	public static void main(String[] args) {

		Gui_10 panel = new Gui_10();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300,300);
		application.setVisible(true);
		
		
	}

}
