import javax.swing.*;
public class string1
{
	public static void main(String[] args) 
	{
		String s1 = JOptionPane.showInputDialog("enter num in word : ");

		switch(s1)
		{
			case "one":
				System.out.println(1);	break;
			case "two":
				System.out.println(2);	break;
		}
	}
}