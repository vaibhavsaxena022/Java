import javax.swing.*;
public class fact
{
	public static void main(String[] args) 
	{
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("num : "));
		int fact=1;

		for(int i=n1; i>0; i--)
		{
			fact = fact * i;
		}
		System.out.println("fact : "+fact);
	}
}