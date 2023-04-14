package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String mom = "Hardworking, Smart, Caring";
		String dad = "Funny, Dedicated, Loving";
		String sister = "Persistent, Enthusiastic, Friendly";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String family = JOptionPane.showInputDialog("Input a family name");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		if (family.equalsIgnoreCase("Mom")) {
			JOptionPane.showMessageDialog(null, mom);

		}
		if (family.equalsIgnoreCase("Dad")) {
			JOptionPane.showMessageDialog(null, dad);

		}
		if (family.equalsIgnoreCase("Sister")) {
			JOptionPane.showMessageDialog(null, sister);

		}
	}
}

