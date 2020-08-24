import javax.swing.*;
import java.util.*;
public class addmatrix
{
	public static void main(String[] args) 
	{
		int rows = 2;
		int cols = 4;
		int arr1[][] = new int[rows][cols];
		int arr2[][] = new int[rows][cols];
		int sum[][] = new int[rows][cols];

		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				arr1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("enter value of aar1 ("+i+","+j+") : "));
			}
		}
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				arr2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("enter value of aar2 ("+i+","+j+") : "));
			}
		}
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				sum[i][j] = arr1[i][j]+arr2[i][j]; 
			}
		}
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}