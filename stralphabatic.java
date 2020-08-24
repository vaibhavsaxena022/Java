import javax.swing.*;
import java.util.*;
public class stralphabatic
{
	public static void main(String[] args) 
	{
		String a[] = new String[5];
		Scanner s = new Scanner(System.in);
		String temp = "";

		for(int i=0; i<5; i++)
		{
			System.out.print("enter a string "+(i+1)+" : ");
			a[i] = s.nextLine();
		}

		for(int i=0; i<5; i++)
		{
			for(int j=i+1; j<5; j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0; i<5; i++)
		{
			System.out.println(""+(i+1)+". "+a[i]);
		}		
	}
}