import javax.swing.*;
public class cond3
{
	public static void main(String[] args) 
	{
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("num : "));
		int temp1;

		temp1 = n1%10;

		if(n1>5)
			System.out.println(""+temp1);
		else
			System.out.println("0");
	}
}