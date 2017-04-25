package day.gui;
import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawPanel extends JPanel {

	
	
	public void paintComponent(Graphics g)
	{
		
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		int h=width/15;
		int m=h;
		int j = height/15;
		int n =j;
		for( int i=1;i<=15;i++)
		{	
		g.drawLine(0,0,0+h,height-j);
		h=h+m;
		j=j+n;
		
		}
		 h=width/15;
		 j = height/15;	
		 m=h;
		 n =j;
		for( int i=1;i<=15;i++)
		{	
		g.drawLine(width,0,width-h,height-j);
		h=h+m;
		j=j+n;
		}
		 h=width/15;
		 j = height/15;	
		 m=h;
		 n =j;
		for( int i=1;i<=15;i++)
		{	
		g.drawLine(0,height,0+h,0+j);
		h=h+m;
		j=j+n;
		}
		 h=width/15;
		 j = height/15;	
		 m=h;
		 n =j;
		for( int i=1;i<=15;i++)
		{	
		g.drawLine(width,height,width-h,0+j);
		h=h+m;
		j=j+n;
		}
	//g.drawLine(0,height,width,0);
		
		
	}
	
	
	
	
	
	
}
