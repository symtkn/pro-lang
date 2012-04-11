import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdapterTest extends JFrame {
	private static final long serialVersionUID = 1L;
	MyDrawPanel drawPanel =  new MyDrawPanel();
	JFrame frame;
	JLabel lbl;
	Container c;
	public static void main(String[] args) {
		AdapterTest ciftBtn = new AdapterTest();
		ciftBtn.setSize(300, 300);
		ciftBtn.setVisible(true);
		ciftBtn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ciftBtn.go();
	}
	public void go() {
		frame = new JFrame();
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton colorBtn = new JButton("Change color");
		JButton lblBtn = new JButton("Change label..");
		lblBtn.addActionListener(new LabelListener());
		colorBtn.addActionListener(new ColorListener());
		lbl = new JLabel("I'm a label");
		frame.addMouseListener(new mAdapterTest());
		
		c = frame.getContentPane();
		c.add(BorderLayout.SOUTH, colorBtn);
		c.add(BorderLayout.CENTER, drawPanel);
		c.add(BorderLayout.EAST, lblBtn);
		c.add(BorderLayout.WEST, lbl);
	}	
	class ColorListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			drawPanel.getX();
			drawPanel.getY();
			frame.repaint(); 
		}
	}
	class LabelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			lbl.setText("işte budur!!");
			
		}
		
	}
	class mAdapterTest extends MouseDinleyici {
		int x, y;
		public void mouseClicked(MouseEvent e){
			x = e.getX();
			y = e.getY();
			drawPanel.setX(x);
			drawPanel.setY(y);
			lbl.setText("cliked at X = " + x + " Y = " + y);
			frame.repaint();
		}
	}
	
}
