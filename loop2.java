import javax.swing.*;
public class loop2
{
	public static void main(String[] args) 
	{
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("num : "));
		int temp1,temp2;

		temp1 = n1%10;
		n1 = n1/10;
		while(n1>0)
		{
			temp2 = n1%10;
			if(temp1 != temp2)
				break;
			n1 = n1/10;
		}
		if(n1==0)
			System.out.println("all digit are same...");
		else
			System.out.println("all digit are not same...");
	}
}