import javax.swing.*;
import java.util.*;
public class power
{
	public static void main(String[] args) 
	{
		int result = 1;
		Scanner s = new Scanner(System.in);
		/*by for loop*/
		System.out.print("enter a num : ");
		int num = s.nextInt();

		System.out.print("enter a power : ");
		int pwr = s.nextInt();

		for(int i=pwr;i>=1;i--)
		{
			result *= num; 
		}
		System.out.println(""+result);
		System.out.println("=======================");

		/*by while loop*/
		while(pwr>=1)
		{
			result *= num;
			pwr--;
		}
		System.out.println(""+result);
		System.out.println("=======================");


		/*by power function*/
		result = Math.pow(num,pwr);
		System.out.println(""+result);
		System.out.println("=======================");
	} 
}