import javax.swing.*;
public class vowcons
{
	public static void main(String[] args) 
	{
		String s = JOptionPane.showInputDialog("enter a string : ");
		s = s.toUpperCase();
		int vcount = 0,ccount = 0;
		int len = s.length();
		System.out.println(""+len); 

		while(len>0)
		{
			len--;
			char a = s.charAt(len);
			if(a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
			{
				vcount++;
			}
			else if(a>='A' && a<='Z')
			{
				ccount++;
			}
		}
		System.out.println("count of vowel : "+vcount);
		System.out.println("count of consonant : "+ccount);
	}
}