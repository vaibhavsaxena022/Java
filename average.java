import javax.swing.*;
import java.util.*;
public class average
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("enter size of an array : ");
		int size = s.nextInt();
		double arr[] = new double[size];
		double sum=0;

		for(int i=0; i<size; i++)
		{
			System.out.print("enter element "+(i+1)+" : ");
			arr[i] = s.nextDouble();
		}

		for(int i=0; i<size; i++)
		{
			sum += arr[i];
		}		
		System.out.println("average : "+(sum/size));
	}
}