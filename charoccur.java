import javax.swing.*;
import java.util.*;
public class charoccur
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("enter a string : ");
		String str = s.next();
		getoccur(str);
	}
	public static void getoccur(String cpy)
	{
		int count[] = new int[256];
		int len = cpy.length();

		for(int i=0; i<len; i++)
		{
			count[cpy.charAt(i)]++;
		}

		char ch[] = new char[cpy.length()];
		for(int i=0; i<len; i++)
		{
			ch[i] = cpy.charAt(i);
			int find=0;
			for(int j=0; j<=i; j++)
			{
				if(cpy.charAt(i)==ch[j])
					find++;
			}
			if(find==1)
				System.out.println("num of occur of " +cpy.charAt(i)+ " is : " +count[cpy.charAt(i)]);
		} 
	}
}