import javax.swing.*;
public class strpalindrome
{
	public static void main(String[] args) 
	{
		String a = JOptionPane.showInputDialog("enter a string : ");
		String b = "";

		for(int i=(a.length()-1); i>=0; i--)
		{
			b = b + a.charAt(i);
		}
		if(a.equals(b))
			System.out.println("String is palindrome...");
		else
			System.out.println("String is not palindrome...");
	}
}