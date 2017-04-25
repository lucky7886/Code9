package guiLaunching;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Gui_7 extends JPanel {
	
	
	private int choice;
	
	public Gui_7(int userChoice)
	{
		choice = userChoice;
	}

	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for(int i=0;i<10;i++)
		{
			switch(choice)
			{
			case 1:
				g.drawRect(10+i*10,10+i*10,50+i*20,50+i*20);
				break;
			case 2:
				g.drawOval(10+i*10,10+i*10,50+i*10,50+i*10);
				break;
			case 3:
				g.drawOval(500+i*10,150+i*10,500-i*20,500-i*20);
				break;
			
			
			
			}
			
			
			
			
		}
		
		
	}
}
