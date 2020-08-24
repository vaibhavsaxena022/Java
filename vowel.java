import javax.swing.*;
public class vowel
{
	public static void main(String[] args) 
	{
		char v = JOptionPane.showInputDialog("enter a character : ").charAt(0);
		boolean isvowel = false;

		switch(v)
		{
			case'a':
			case'A':
			case'e':
			case'E':
			case'i':
			case'I':
			case'o':
			case'O':
			case'u':
			case'U': isvowel = true; 
		}
		if(isvowel==true)
		{
			System.out.println("character is vowel...");
		}
		else 
		{
			if((v>='a' && v<='z')||(v>='A' && v<='Z'))
			{
				System.out.println("character is consonant");
			}
			else
			{	
				System.out.println("not a character");
			}
		}
	}
}