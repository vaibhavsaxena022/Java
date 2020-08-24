import javax.swing.*;
public class array8
{
	public static void main(String[] args) 
	{
		int size = Integer.parseInt(JOptionPane.showInputDialog("size : "));
		int arr[] = new int[size];
		int check,count=0;

		for(int i=0; i<size; i++)
		{
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog("input : "));
		}	

		check = Integer.parseInt(JOptionPane.showInputDialog("enter element : "));

		int i=0;
		while(i<size)
		{
			if(check==arr[i])
				count++;
			i++;
		}
		System.out.println(""+count);
	}
}