import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class MyDrawPanel extends JPanel {
	int x, y;
	private static final long serialVersionUID = 1L;
	public void paintComponent(Graphics g){
		int red = (int)(Math.random() * 255);
		int green = (int)(Math.random() * 255);
		int blue = (int)(Math.random() * 255);
		Color randomColor = new Color(red, green, blue);
		g.setColor(randomColor);
		g.fillOval(x, y , 100, 100);

	}
	
	public void setX(int a){
		x = a; 
	}
	public void setY(int b){
		y = b;
	}
	public int getX(){
		System.out.println("x koornatı = " + x);
		return x;
		
	}
	public int getY(){
		System.out.println("y koordinatı = " + y);
		return y;
	}
		

}
