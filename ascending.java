import javax.swing.*;
public class ascending
{
	public static void main(String[] args) 
	{
		int arr[] = new int[5];
		int temp;

		for(int i=0; i<5; i++)
		{
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog("enter element : "));
		}
		for(int i=0; i<5; i++)
		{
			for(int j=i+1; j<5; j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0; i<5; i++)
		{
			System.out.println("element "+(i+1)+" : "+arr[i]);
		}
	}
}