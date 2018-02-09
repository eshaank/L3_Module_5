package other;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Hangman implements KeyListener{
JFrame frame;
JPanel panel;
JLabel label;
String word;
int x = 250;
int y = 300;
String lines;
boolean keyTyped = false;


ArrayList<String> letters = new ArrayList<String>();
HashMap<Integer, String> stack = new HashMap<Integer, String>();
	public static void main(String[] args) {
		Hangman hangman = new Hangman();
		hangman.wordList();
		
		hangman.main();
	}
	
	
	
 void main() {
	 main2();
	 frame = new JFrame();
	
	
	frame.setVisible(true);
	frame.setSize(500, 250);
	frame.add(panel);
	panel.add(label);
	frame.setTitle("Hangman?");
	
	frame.addKeyListener(this);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}

void main2() {
	 label = new JLabel();
	 panel = new JPanel();
	
	int min = 1;
	int max = 25;
	Random randomNum = new Random();
	int random = min + randomNum.nextInt(max);
	
	  word = stack.get(random);
	
	//label.setText(stack.get(random));
	System.out.println(stack.get(random));
	System.out.println(word.length());	
	
	Lines();
}
void Lines() {
	 lines = "";
	
	for (int i = 0; i < word.length(); i++) {
	lines += "_ ";
		
	}
	label.setText(lines);
	}
void wordList(){
	
	stack.put(1, "abruptly");
	stack.put(2, "abyss");
	stack.put(3, "espionage");
	stack.put(4, "grogginess");
	stack.put(5, "flapjack");
	stack.put(6, "kazoo");
	stack.put(7, "megahertz");
	stack.put(8, "whiskey");
	stack.put(9, "transplant");
	stack.put(10, "oxidize");
	stack.put(11, "razzmatazz");
	stack.put(12, "marquis");
	stack.put(13, "mnemonic");
	stack.put(14, "quixotic");
	stack.put(15, "peekaboo");
	stack.put(16, "polka");
	stack.put(17, "naphtha");
	stack.put(18, "rhythm");
	stack.put(19, "yippee");
	stack.put(20, "zephyr");
	stack.put(21, "yachtsman");
	stack.put(22, "woozy");
	stack.put(23, "uptown");
	stack.put(24, "java");
	stack.put(25, "computer");
	
	
	
	
	
	
	
}
@Override
public void keyTyped(KeyEvent e) {
	keyTyped = true;
	if(word.contains(e.getKeyChar() + "")) {
		letters.add(e.getKeyChar() + "");
		String hi = "";
		for (int i = 0; i < word.length(); i++) {
			lines.replaceFirst("_", "");
			System.out.println("hi");
			if(word.contains(letters + "")) {
			hi += letters.get(i) + "";
			}
			else {
				hi+="_";
			}
		}
		//System.out.println(letters);
	}
	else {
		JOptionPane.showMessageDialog(null, "Pick another letter por favor");
	}
	
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
