package practice;

import javax.swing.JOptionPane;

public class divisorRunner {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "enter a number to get the divisors");
		int num = Integer.parseInt( JOptionPane.showInputDialog("enter number:"));
		divisor numdivider = new divisor(num);
		
		numdivider.finddivisors(num);
		
	}
}
