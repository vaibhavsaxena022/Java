import javax.swing.*;
import java.util.*;
public class chartostring
{
	public static void main(String[] args) 
	{
		/*char to string...*/
		char ch = 'a';
		String str = Character.toString(ch);
		System.out.println("String is : "+ch);

		/*string to char...*/
		String str2 = "AJMER";
		for(int i=0; i<str2.length(); i++)
		{
			char ch2 = str2.charAt(i);
			System.out.println("char at "+(i+1)+" : "+ch2);
		}
	}
}