package guiLaunching;
import javax.swing.JFrame;

public class Gui_8Test {

	public static void main(String[] args) {

		Gui_8 panel = new Gui_8();
		
	JFrame application = new JFrame();	
		
	application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	application.add(panel);
	application.setSize(500,500);
	application.setVisible(true);
	
		
	}

}
