import javax.swing.*;
public class practice3
{
	static void table(int b)
	{	
		if(b<=20)
		{
			System.out.println(b);
			table(b+2);
		}	
	}
	public static void main(String[] args) 
	{
		table(2);
	}
}