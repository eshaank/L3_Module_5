package other;

import java.awt.Graphics;

import javax.swing.JComponent;

public class HangPanel extends JComponent{
@Override
public void paint(Graphics g) {
	g.drawRect(100, 200, 10, 100);
	g.fillRect(50, 50, 100, 200);
	
	
}
}
