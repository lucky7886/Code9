package guiLaunching;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Gui_10 extends JPanel {

public void paintComponent(Graphics g)
{
super.paintComponent(g);
int a=0,b=0,c=0,d=0;
//d=-100;
int j=1;
//int e=0;
int f=-1;
int sign=-1;
int centerX = getWidth()/2;
int centerY = getHeight()/2;
for(int i=1;i<100;i++)
{
	
if(i%2!=0){
f++;
//if(f==1 || f==5 || f==9 || f==13 || f==17 || f==21 || f==25)
	//j*=2;
	//e++;
if(f%4==0)
	j*=2;
	a=b=c;
	//if(e==4*i-3)
		//j*=2;
	
	d=sign*5*j;
	g.drawLine(centerX+a,centerY+b,centerX+c,centerY+d);
sign*=-1;

}
else
	{
	f++;
	//e++;
	b=c=d;
	g.drawLine(centerX+a,centerY+b,centerX+c,centerY+d);
	}

//g.drawLine(centerX,centerY,centerX,centerY-100);
//g.drawLine(centerX,centerY-100,centerX-100,centerY-100);
//g.drawLine(centerX-100,centerY-100,centerX-100,centerY+100);
	//g.drawLine(centerX-100,centerY+100,centerX+100,centerY+100);
}

}

}
