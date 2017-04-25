package guiLaunching;
import javax.swing.JFrame;
public class Gui_9Test {

	public static void main(String[] args) {

		Gui_9 panel = new Gui_9();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400,250);
		application.setVisible(true);
		
		
		
	}

}
