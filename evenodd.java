import javax.swing.*;
public class evenodd
{
	public static void main(String[] args) 
	{
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("enter num : "));
		if(n1%2==0)		
			System.out.println("even num");
		else
			System.out.println("odd num");
	}
}