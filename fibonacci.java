import javax.swing.*;
public class fibonacci
{
	public static void main(String[] args) 
	{
		int n1=0, n2=10;
		int t1=0, t2=1;
		int sum=0;

		while(n1<n2)
		{
			System.out.print(" "+t1);
			sum = t1+t2;
			t1 = t2;
			t2 = sum;	

			n1++;
		}
	}
}