import javax.swing.*;
import java.util.*;
public class gcdorhcf
{
	public static void main(String[] args) 
	{
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("enter num1 : "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("enter num2 : "));

		while(num1 != num2)
		{
			if(num1>num2)
				num1 = num1-num2;
			else
				num2 = num2-num1;
		}
		System.out.println("hcf : "+num2);
	}
}