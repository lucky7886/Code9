package advanced;
import java.awt.Color;
import java.util.Random;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Concentric_Circles extends JPanel {

	Random r = new Random();
	
	Color x = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
	Color y = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
	Color z = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
	Color p = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
	Color q = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
	
	Color[] colors = {x,y,z,p,q};
	public void paintComponent(Graphics g)
{
super.paintComponent(g);
for(int i=0;i<5;i++)
{
g.setColor(colors[i]);	
g.drawOval(500+i*10,150+i*10,300-i*20,300-i*20);
g.fillOval(500+i*10,150+i*10,150-i*20,150-i*20);
g.fillOval(650+i*10,150+i*10,150-i*20,150-i*20);
g.fillOval(650+i*10,300+i*10,150-i*20,150-i*20);
g.fillOval(500+i*10,300+i*10,150-i*20,150-i*20);
}



}
	
	
	
}
