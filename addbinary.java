import javax.swing.*;
import java.util.*;
public class addbinary
{
	public static void main(String[] args) 
	{
		int i=0 , carry=0;
		int sum[] = new int[10];
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter 1st binary no : ");
		long b1 = s.nextLong();

		System.out.println("enter 2nd binary no : ");
		long b2 = s.nextLong();

		while(b1!=0 || b2!=0)
		{
			sum[i] = (int)((b1%10 + b2%10 + carry)%2);
			carry = (int)((b1%10 + b2%10 + carry)/2);
			b1 = b1 / 10;
			b2 = b2 / 10;
			i++;
		}
		if(carry != 0)
			sum[i] = carry;

		while(i>=0)
		{
			System.out.print(sum[i--]);
		}
	}
}