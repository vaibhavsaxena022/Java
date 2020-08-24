import javax.swing.*;
public class perfect
{
	public static void main(String[] args) 
	{
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("num : "));
		int sum=0;

		for(int i=1; i<n1; i++)
		{
			if(n1%i==0)
				sum = sum+i;
		}
		if(sum==n1)
			System.out.println("perfect no...");
		else
			System.out.println("not a perfect no...");
	}
}