import javax.swing.*;
import java.util.*;
public class largest
{
	public static void main(String[] args) 
	{
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("enter num1 : "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("enter num2 : "));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("enter num3 : "));

		if(num1>=num2 && num1>=num3)
			System.out.println("num1 is largest..");
		if(num2>=num1 && num2>=num3)
			System.out.println("num2 is largest..");
		else
			System.out.println("num3 is largest..");		

		/*using ternary operator....*/
		int temp = num1>num2 ? num1 : num2;
		int result = num3>temp ? num3 : temp;
		System.out.println("largest of three no : "+result);
	}
}