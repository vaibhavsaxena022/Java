import javax.swing.*;
public class permutationstring 
{ 
	static void permutation(String str, String ans) 
	{ 
		if (str.length() == 0) 
		{ 
		 	System.out.print(ans + " "); 
			return; 
		} 
		for (int i = 0; i < str.length(); i++) 
		{ 
			char ch = str.charAt(i); 
			String s2 = str.substring(0, i) + str.substring(i + 1); 
			permutation(s2, ans + ch); 
		} 
	}  
	public static void main(String[] args) 
	{ 
		String s = JOptionPane.showInputDialog("enter name : "); 
		permutation(s,""); 
	} 
} 
