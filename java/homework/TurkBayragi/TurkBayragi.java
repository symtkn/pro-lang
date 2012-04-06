import java.applet.*;
import java.awt.*;


public class TurkBayragi extends Applet{
	private static final long serialVersionUID = 1L;
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillRect(0, 0, 500, 400);
		g.setColor(Color.white);
		g.fillOval(40, 65, 272, 272);
		g.setColor(Color.red);
		g.fillOval(90, 88, 234, 234);
		g.setColor(Color.white);
		int x[] = {270, 325, 325, 360, 410, 380, 425, 360, 325, 325};
		int y[] = {215, 190 , 130 , 175 , 150 , 203 , 250 , 230 , 285 , 225};
		g.fillPolygon(x, y, 10);
	}

}
