import javax.swing.*;
public class array10
{
	public static void main(String[] args) 
	{
		int size = Integer.parseInt(JOptionPane.showInputDialog("size : "));
		int arr[] = new int[size];
		int temp=0;

		for(int i=0; i<size; i++)
		{
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog("input : "));
		}	

		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for(int i=0; i<size; i++)
		{
			System.out.print("	"+arr[i]);
		}
	}
}