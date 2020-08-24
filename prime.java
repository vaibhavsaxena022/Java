import javax.swing.*;
import java.util.*;
public class prime
{
	public static void main(String[] args) 
	{
		Scanner s =  new Scanner(System.in);
		System.out.print("enter a lmt : ");
		int lmt = s.nextInt();
		int num = 3;
		int div = 2;

	System.out.println(2);
	while(num<lmt)
	{
		div=2;
		while(num>div)
		{
			if(num%div==0)
			{
				break;
			}
			div++;
		}
		if(div==num)
		{
			System.out.println(""+num);
		}
		num++;
	}
	}
}