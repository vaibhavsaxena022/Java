import javax.swing.*;
public class arrreverse
{
	public static void main(String[] args) 
	{
		/*note:- first method is to print array in reverse order..*/
		/*note:- second method is to swap array index values..*/

		int arr[] = new int[5];
		int temp;

		for(int i=0,j=4; i<5; i++,j--)
		{
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog("enter element "+(i+1)+" : "));
		}
		for(int i=0,j=4; i<5/2; i++,j--)
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for(int i=0; i<5; i++)
		{
			System.out.println("element "+(i+1)+" : "+arr[i]);
		}
	}
}