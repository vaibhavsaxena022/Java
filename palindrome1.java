import javax.swing.*;
public class palindrome1
{
	public static void main(String[] args) 
	{
		int sum=0,i=0;
		int num = Integer.parseInt(JOptionPane.showInputDialog("enter a no : "));
		int temp = num;

		while(num>0)
		{
			i = num % 10;
			sum = (sum*10)+i;
			num = num / 10;
		}
		if(sum==temp)
			System.out.println("no. is palindrome...");
		else
			System.out.println("no. is not palindrome...");
	}
}