import javax.swing.*;
public class string3
{
	public static void main(String[] args) 
	{
		String s1 = JOptionPane.showInputDialog("enter string : ");
		char ch;

		for(int i=(s1.length())-1; i>=0; i--)
		{
			ch = s1.charAt(i);
			System.out.print(""+ch);
		}
	}
}