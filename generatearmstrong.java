import javax.swing.*;
import java.util.*;
public class generatearmstrong
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter starting num : ");
		int srt = s.nextInt();

		System.out.println("enter ending num : ");
		int lst = s.nextInt();

		for(int i = srt; i<=lst; i++)
		{
		int temp = i;
		int sum = 0;
		int power;

		while(temp>0)
		{
			power = temp % 10;
			temp = temp / 10;
			sum = sum + (power * power * power);
		}
		if(sum==i){
			System.out.println(" "+i);
		}
		}
	}
}