import javax.swing.*;
public class loop7
{
	public static void main(String[] args) 
	{
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("num : "));
		int sum=0,temp;

		while(n1>0)
		{
			temp = n1%10;
			sum = (sum*10)+temp;
			n1 = n1/10;
		}
		System.out.println("reverse : "+sum);
	}
}