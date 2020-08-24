import javax.swing.*;
import java.util.*;
public class leap
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.print("enter year : ");
		int year = s.nextInt();

		boolean isleap = false;

		if(year%4==0)
		{
			if(year%100==0)
			{ 
				if(year%400==0)
					isleap = true;
				else
					isleap = false;
			}
			else
				isleap = true;
		}
		else
			isleap = false;

		if(isleap==true)
			System.out.println("this is leap year...");
		else
			System.out.println("this is not leap year...");
	}
}