package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {

		String question = JOptionPane.showInputDialog("When is your birthday?");
		if (question.equals("April 14")) {
			JOptionPane.showMessageDialog(null, "Have a very Happy Birthday!");

		}
		else {
			JOptionPane.showMessageDialog(null,"Have a verry merry Unbirthday :(" );
			
		}
	}
}
