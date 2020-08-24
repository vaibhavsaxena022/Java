import javax.swing.*;
public class emailid
{
	public static void main(String[] args) 
	{
		String a = JOptionPane.showInputDialog("enter email : ");
		boolean status = true;
		a = a.toLowerCase();

		if(!a.startsWith("www."))
		{
			System.out.println("not starts with www.");
			status=false;
		}
		if(!(a.endsWith(".com") || a.endsWith(".net")))
		{	
			System.out.println("not ends with .com or .net");
			status=false;
		}

		int q1 = a.indexOf(" ");
		if(q1>0)
		{
			System.out.println("space not allowed");
			status=false;
		}

		int q2 = a.indexOf(".");
		int q3 = a.lastIndexOf(".");
		if(q3-q2<=1)
		{
			System.out.println("atleast one character allowed");
			status=false;
		}

		if(status==true)
			System.out.println("valid email..");
	}
}