import javax.swing.*;
import java.util.*;
public class intTodigit
{
	public static void main(String[] args) 
	{
		int num = Integer.parseInt(JOptionPane.showInputDialog("enter a num : "));
		int temp,dgt;
		int cnt = 0;

		temp = num;

		while(temp>0)
		{
			dgt = temp%10;
			System.out.println(""+dgt);
			temp = temp/10;
			cnt++;
		}	
		System.out.println("count of digit : "+cnt);
	}
}