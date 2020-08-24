import javax.swing.*;
public class practice1
{
	public static void main(String[] args) 
	{
		String a = JOptionPane.showInputDialog("enter string : ");
		String b[] = a.split(" ");

		for(int i=0; i<b.length; i++)
		{
			char ch[] = b[i].toCharArray();
			for(int j=(ch.length)-1; j>=0; j--)
			{
				if(j == (ch.length)-1)
				{
					ch[j] = Character.toUpperCase(ch[j]);
				}
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
	}
}