import javax.swing.*;
public class loop9c
{
	public static void main(String[] args) 
	{
		int sum = 1;
		for(int i=0; i<=10; i++)
		{
			System.out.print(" "+(sum += i));
		}
	}
}