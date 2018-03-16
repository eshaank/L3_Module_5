package other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class shoppingList {
	public static void main(String[] args) {
		File file = new File("../list.txt");
		Scanner kb = new Scanner(System.in);
		try {
			PrintWriter out = new PrintWriter(new FileWriter(file, true));
			
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			System.out.println("Type 'add' to add and object to the list");
			String num = kb.nextLine();
			if (num.equals("add")) {
				System.out.println("Type what you would like to add");
				String list = kb.nextLine();
				out.println(list);
			}
			out.close();
			while(reader.ready()) {
				System.out.println(reader.readLine());
			}
		
		
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
