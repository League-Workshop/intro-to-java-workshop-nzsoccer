package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
	String name=	JOptionPane.showInputDialog("Who are you?");
	System.out.println(name);
JOptionPane.showMessageDialog(null, "Hello there." + name);	}

}
