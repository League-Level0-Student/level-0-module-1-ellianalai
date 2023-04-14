package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle_1 = JOptionPane.showInputDialog("What do you get when you cross a snowman and a shark?");
		
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (riddle_1.equalsIgnoreCase("Frostbite")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
			
			}
		else {
			JOptionPane.showMessageDialog(null, "Wrong. The Answer is Frostbite, not " + riddle_1);
		}
		JOptionPane.showMessageDialog(null, "Your score is " + score);
		String riddle_2 = JOptionPane.showInputDialog("What has a head and a tail but no body?");
		if (riddle_2.equalsIgnoreCase("A Coin")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
			
			}
		else {
			JOptionPane.showMessageDialog(null, "Wrong. The Answer is a Coin, not " + riddle_2);
		}
		JOptionPane.showMessageDialog(null, "Your score is " + score);
		// 5. Otherwise, say "wrong" and tell them the answer
		
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

