import javax.swing.*;
public class strreverse
{
	public static void main(String[] args) 
	{
		String a = JOptionPane.showInputDialog("enter a string : ");
		String b = "";

		for(int i=(a.length()-1); i>=0; i--)
		{
			b = b + a.charAt(i);
		}
		System.out.println("String : "+b);
	}
}