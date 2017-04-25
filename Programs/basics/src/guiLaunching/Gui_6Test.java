
package guiLaunching;
import javax.swing.JFrame;
public class Gui_6Test {

	public static void main(String[] args) {

		Gui_6 panel = new Gui_6();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(250,250);
		application.setVisible(true);
		
	}

}
