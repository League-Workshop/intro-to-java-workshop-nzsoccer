package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;

		// 2. Ask the user a question
		String answer = JOptionPane
				.showInputDialog("Name the best players who graduated from the La Masia Academy");

		// 3. Use an if statement to check if their answer is correct
		if (answer.equals("Messi, Pique, Iniesta, Faberegas, Xavi")) {

			// 4. if the user's answer is correct
			score++;
			JOptionPane.showMessageDialog(null, "correct!");
		}
		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.

		answer = JOptionPane.showInputDialog("Name the five best soccer players of all time who are retired");
		if (answer.equals("Pele, Maradona, Zidane, Ronaldo Nazario de la Lima, Ronaldinho")) {
			score++;
			JOptionPane.showMessageDialog(null, "Good job!");

		}
		answer = JOptionPane.showInputDialog("Name all of the FIFA World Cup winners from 1998-2018");
		if (answer.equals("France, Brazil, Italy, Spain, Germany, France")) {
			score++;
			JOptionPane.showMessageDialog(null, "Your doing great!");
		}
		// 6. After all the questions have been asked, print the user's score
		JOptionPane.showMessageDialog(null, "Your score is " + score);

	}
}
