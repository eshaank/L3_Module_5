package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class ListTest {
 public static void main(String[] args) {
	 String test= JOptionPane.showInputDialog("enter sentence");
	 ArrayList<String> lister = new ArrayList<>(Arrays.asList(test.split(" ")));
	 
	 HashMap<String, String>map = new HashMap<>();
	 
	 map.put("hi", "Bye");
	 map.put("the", "stupid");
	 for(String word : lister) {
		 if(map.get(word)!= null)
			 System.out.print(map.get(word)+" ");
		 else
			 System.out.print(word+" ");
	 }
		
}
}
