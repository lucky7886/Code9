package GuiInAbundance;
import javax.swing.JFrame;
public class Gui6Test {

	public static void main(String[] args) {

		Gui6 panel = new Gui6();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);
		
		application.setSize(250,250);
		
		application.setVisible(true);
		
		
	}

}
