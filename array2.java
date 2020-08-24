import javax.swing.*;
public class array2
{
	public static void main(String[] args) 
	{
		int fact=1;
		int size = Integer.parseInt(JOptionPane.showInputDialog("size : "));
		int arr[] = new int[size];

		for(int i=0; i<size; i++)
		{
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog("input : "));
		}	
		int i=0;
		while(i<size)
		{
			for(int j=arr[i]; j>0; j--)
				fact = fact*j;
			System.out.print(" "+fact);
			fact=1;
			i++;
		}
	}
}