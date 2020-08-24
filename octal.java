import javax.swing.*;
public class octal
{
	public static void main(String[] args) 
	{
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("num : "));
		int o[] = new int[20];
		int index=0;

		while(n1>0)
		{
			o[index] = n1%8;
			n1 = n1/8;
			index++;
		}
		for(int i=index-1; i>=0; i--)
			System.out.print(""+o[i]);
	}
}