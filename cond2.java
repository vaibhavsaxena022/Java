import javax.swing.*;
public class cond2
{
	public static void main(String[] args) 
	{
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("num : "));
		int temp1,temp2=9,temp3=9;

		while(n1>0)
		{
			temp1 = n1%10;
			if(temp1<temp2 && temp1<temp3)
				temp3 = temp1;
			n1 = n1/10;
		}
		System.out.println("smallest digit : "+temp3);
	}
}