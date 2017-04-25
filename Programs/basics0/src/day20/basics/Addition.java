package day20.basics;

import javax.swing.JOptionPane;
public class Addition {

	public static void main(String[] args) {

		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("enter the first number"));
		String num = JOptionPane.showInputDialog("enter the second number");
		int num2 = Integer.parseInt(num);
		int sum=num1+num2;
		String message = String.format("The sum is %d",sum);
		JOptionPane.showMessageDialog(null, message);
	}

}
