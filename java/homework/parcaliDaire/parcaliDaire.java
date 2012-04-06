import java.awt.*;
import java.applet.*;
public class parcaliDaire extends Applet {
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		int x = 20,y = 20;
		g.fillArc(x, y, 200, 200, 90, 45);
		g.fillArc(x, y, 200, 200, 180, 45);
		g.fillArc(x, y, 200, 200, -45, -45);
		g.fillArc(x, y, 200, 200, 360, 45);
	}
}