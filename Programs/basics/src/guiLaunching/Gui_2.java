package guiLaunching;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui_2 extends JFrame {

	private JLabel item1;
	
	public Gui_2(){
		
		super("The title bar");
		
		setLayout(new FlowLayout());
		
	item1 = new JLabel("this is a sentence");
	
	item1.setToolTipText("this is gonna show up on hover");
	
	add(item1);
		
	}
	
	
}
