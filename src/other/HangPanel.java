package other;

import java.awt.Graphics;

import javax.swing.JComponent;

public class HangPanel extends JComponent{
@Override
public void paint(Graphics g) {
	g.fillRect(50, 178, 125, 10);
	g.fillRect(175, 178, 10, 35);
	g.fillRect(50, 178, 10, 350);
	g.fillRect(50, 470, 285, 10);
	
}

public void head(Graphics g) {
	g.drawOval(148, 213, 65, 65);
}
}
