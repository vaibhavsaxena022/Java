import javax.swing.*;
public class practice2
{
	public static void main(String[] args) 
	{
		String a = "counter clock world";
		String b[] = a.split(" ");
		String temp;

		for(int i=0; i<b.length; i++)
		{
			for(int j=i+1; j<b.length; j++)
			{
				if(b[i].length()>b[j].length())
				{
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}