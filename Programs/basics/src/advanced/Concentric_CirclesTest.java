package advanced;
import javax.swing.JFrame;
public class Concentric_CirclesTest {

	public static void main(String[] args) {

		Concentric_Circles panel = new Concentric_Circles();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(290,290);
		application.setVisible(true);
		
		
	}

}
