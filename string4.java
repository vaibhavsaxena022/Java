import javax.swing.*;
public class string4
{
	public static void main(String[] args) 
	{
		String s1[] = new String[5];
		String temp="";
		
		for(int i=0; i<5; i++)
		{
			s1[i] = JOptionPane.showInputDialog("enter name : ");
		}

		for(int i=0; i<5; i++)
		{
			for(int j=i+1; j<5; j++)
			{
				if(s1[i].compareTo(s1[j])>0)
				{
					temp = s1[i];
					s1[i] = s1[j];
					s1[j] = temp;
				}
			}
		}
		for(int i=0; i<5; i++)
		{
			System.out.println(s1[i]);
		}
	}
}