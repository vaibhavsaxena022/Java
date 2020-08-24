import javax.swing.*;
import java.util.*;
public class prftsq
{
	public static void main(String[] args) 
	{
		// Scanner s = new Scanner(System.in);
		// double num = s.nextDouble();

		double num = Double.parseDouble(JOptionPane.showInputDialog("enter a sq. of a number : "));

		double sq = Math.sqrt(num);

		if(sq - Math.floor(sq) == 0)
		{
			System.out.println("num is perfect square..");
		}
		else
			System.out.println("num is not perfect square..");
	}
}