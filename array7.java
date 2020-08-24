import javax.swing.*;
public class array7
{
	public static void main(String[] args) 
	{
		int size = Integer.parseInt(JOptionPane.showInputDialog("size : "));
		int arr[] = new int[size];
		int search;

		for(int i=0; i<size; i++)
		{
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog("input : "));
		}	

		search = Integer.parseInt(JOptionPane.showInputDialog("enter element to search : "));
		
		int i=0;
		while(i<size)
		{
			if(search==arr[i])
				System.out.println("position of element is : "+i);
			i++;
		}
	}
}