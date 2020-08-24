import javax.swing.*;
import java.util.*;
public class armstrong
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("enter num : ");
		int num = s.nextInt();

		int temp = num;
		int sum = 0;
		int power;

		while(num>0)
		{
			power = num % 10;
			num = num / 10;
			sum = sum + (power * power * power);
		}
		if(sum==temp)
			System.out.println("its an armstrong num..");
		else
			System.out.println("its not an armstrong num..");
	}
}