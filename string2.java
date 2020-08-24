import javax.swing.*;
public class string2
{
	public static void main(String[] args) 
	{
		String s1 = JOptionPane.showInputDialog("enter name : ");
		char ch;
		int cnt=0;

		for(int i=0; i<s1.length(); i++)
		{
			ch = s1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				cnt++;
		}
		System.out.println(" "+cnt);
	}
}