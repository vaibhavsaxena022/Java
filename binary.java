import javax.swing.*;
public class binary
{
	public static void main(String[] args) 
	{
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("num : "));
		int b[] = new int[20];
		int index=0;

		while(n1>0)
		{
			b[index] = n1%2;
			n1 = n1/2;
			index++;
		}
		for(int i=index-1; i>=0; i--)
			System.out.print(""+b[i]);
	}
}