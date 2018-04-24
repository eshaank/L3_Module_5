package other;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Hangman implements KeyListener {
	HangPanel hanger = new HangPanel();
	JFrame frame;
	JFrame frame2;
	JPanel panel;
	JPanel panel2;
	JPanel panel3;
	JLabel label;
	JLabel label2;
	JLabel label3;

	String word;
	int x = 250;
	int y = 300;
	String lines;
	boolean keyTyped = false;
	 int lifeCounter = 24;
	 int livesLeft;
	ArrayList<String> letters = new ArrayList<String>();
	ArrayList<String> puzzle = new ArrayList<String>();
	HashMap<Integer, String> stack = new HashMap<Integer, String>();

	public static void main(String[] args) {

		Hangman hangman = new Hangman();
		hangman.wordList();

		hangman.main();
		
	}

	void main() {
		main2();
		//livesLeft();
		frame = new JFrame();
		
		frame.setVisible(true);
		frame.setSize(850, 500);
		frame.add(panel);
		

		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		frame.setTitle("Hangman?");

		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//panel.add(label);
		
		
	}

	void main2() {
		label = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		
		label3.setText("You have 24 lives.");	
		
		panel = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				hanger.paint(g);
				if (lifeCounter == 20) {
					g.drawOval(148, 213, 65, 65);
					System.out.println("hi");
				}
			};
		};
		panel.repaint();

		int min = 1;
		int max = 25;
		Random randomNum = new Random();
		int random = min + randomNum.nextInt(max);

		word = stack.get(random);

		// label.setText(stack.get(random));
		System.out.println(stack.get(random));
		System.out.println(word.length());

		Lines();
	}
	
	void drawHead() {

		panel = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawOval(148, 213, 65, 65);

			};
		};
		panel.repaint();
	}

	void Lines() {

		for (int i = 0; i < word.length(); i++) {
			puzzle.add("_");

		}
		label.setText(puzzle + "");
	}

	void wordList() {

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

		if (word.contains(e.getKeyChar() + "")) {
			letters.add(e.getKeyChar() + "");

			for (int i = 0; i < word.length(); i++) {

				for (int j = 0; j < letters.size(); j++) {
					if (letters.size() > 0) {
						if (letters.get(j).equals(word.charAt(i) + "")) {
							String place = letters.get(j);
							puzzle.set(i, place);
							label.setText(puzzle + "");
						}

					}
				}

			}
		} 
		
		else {
		label3.hide();
		 lifeCounter--;
			JOptionPane.showMessageDialog(null, "Pick another letter por favor");
			label2.setLocation(175, 200);
			label2.setText("You have " + lifeCounter + " lives.");
			//System.out.println("lives shown");
			
			
			if (lifeCounter == 0) {
				
				label.setText(word);
				JOptionPane.showMessageDialog(null,  "You lost. The word was " + word);
				
				frame.dispose();
			}
			
			
		}
		 if (!puzzle.contains("_")) {
			System.out.println("hi");
			JOptionPane.showMessageDialog(null, "Good Job! \n You got the correct word, " + word + ".");
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
