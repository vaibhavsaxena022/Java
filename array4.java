import javax.swing.*;
import java.lang.Math;
public class array4
{
	public static void main(String[] args) 
	{
		int temp1=0,power=0,sum=0;
		int size = Integer.parseInt(JOptionPane.showInputDialog("size : "));
		int arr[] = new int[size];

		for(int i=0; i<size; i++)
		{
			sum=0;
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog("input : "));
			temp1 = arr[i];
			while(arr[i]>0)
			{
				power = arr[i]%10;
				arr[i] = arr[i]/10;
				sum = sum + (power*power*power);
			}
			if(sum==temp1)
				System.out.print(" "+temp1);
		}	
	}
}