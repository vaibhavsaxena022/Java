import javax.swing.*;
public class cond7
{
	public static void main(String[] args) 
	{
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("num : "));
		
		if(n1%2==1)
		{
			if(n1>9 && n1<100)
				System.out.println("two digit odd num...");
			else
				System.out.println("not a two digit odd num...");
		}
		else
			System.out.println("even num...");
	}
}