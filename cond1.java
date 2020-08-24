import javax.swing.*;
public class cond1
{
	public static void main(String[] args) 
	{
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("num1 : "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("num2 : "));

		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;

		System.out.println("num1 : "+n1);
		System.out.println("num2 : "+n2);
	}
}