import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

public class KeyAdapterTest extends JFrame implements KeyListener {
	private static final long serialVersionUID = 1L;
	JLabel label = new JLabel();
	int x = 20 , y = 20;
	public KeyAdapterTest() {
		this.addKeyListener(this);
		this.setSize(500,500);
		this.setVisible(true);
		this.getContentPane().add(label,BorderLayout.NORTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
			x+=20;
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
			x-=20;
		if(e.getKeyCode() == KeyEvent.VK_UP)
			y-=20;
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
			y+=20;
		Graphics g = getGraphics();			//pointComponent metodunu çağırmadan işlemi hızlandırmak için bu şekilde çağrıda bulunduk
		Graphics g2 = getGraphics();
		g.setColor(Color.PINK);
		g2.setColor(Color.blue);
		g.fillRect(x, y, 100,100);	
		g2.drawOval(x, y, 100, 100);
		g.dispose();  						//Grafik nesnesini yeniden çizmemizi sağlar
		g2.dispose();
	}	
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
	}
	public static void main(String [] args) {
		new KeyAdapterTest();
	}
}
