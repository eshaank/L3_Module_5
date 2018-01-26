package other;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Hangman implements KeyListener{
JFrame frame;
JPanel panel;
JLabel label;
String word;

ArrayList<String> puzzle = new ArrayList<String>();
Stack<String> stack = new Stack<String>();
	public static void main(String[] args) {
		Hangman hangman = new Hangman();
		System.out.println(hangman.stack.indexOf(1));
		hangman.main();
	}
	
	
	
 void main() {
	 frame = new JFrame();
	 panel = new JPanel();
	 label = new JLabel();
	frame.setVisible(true);
	frame.setSize(500, 250);
	frame.add(panel);
	panel.add(label);
	frame.setTitle("Hangman?");
	frame.addKeyListener(this);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}

void main2() {
	
	
}

void wordList(){
	
	stack.set(1, "abruptly");
	stack.set(2, "abyss");
	stack.set(3, "espionage");
	stack.set(4, "grogginess");
	stack.set(5, "flapjack");
	stack.set(6, "kazoo");
	stack.set(7, "megahertz");
	stack.set(8, "whiskey");
	stack.set(9, "transplant");
	stack.set(10, "oxidize");
	stack.set(11, "razzmatazz");
	stack.set(12, "marquis");
	stack.set(13, "mnemonic");
	stack.set(14, "quixotic");
	stack.set(15, "peekaboo");
	stack.set(16, "polka");
	stack.set(17, "naphtha");
	stack.set(18, "rhythm");
	stack.set(19, "yippee");
	stack.set(20, "zephyr");
	stack.set(21, "yachtsman");
	stack.set(22, "woozy");
	stack.set(23, "uptown");
	stack.set(24, "java");
	stack.set(25, "computer");
	
	puzzle.addAll(stack);
	
	
	
	
	
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
