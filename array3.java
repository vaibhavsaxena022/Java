import javax.swing.*;
public class array3
{
	public static void main(String[] args) 
	{
		int size = Integer.parseInt(JOptionPane.showInputDialog("size : "));
		int arr[] = new int[size];

		for(int i=0; i<size; i++)
		{
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog("input : "));
		}	
		int i=0,odd=0;
		while(i<size)
		{
			if(arr[i]%2==1)
				odd = arr[i];
			i++;
		}
		System.out.println("odd : "+odd);
	}
}