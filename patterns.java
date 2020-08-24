import javax.swing.*;
public class patterns
{
	public static void main(String[] args) 
	{
			System.out.println("1. right triangle : ");
			for(int i=1; i<=4; i++)
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}

			System.out.println("--------------------");

			System.out.println("2. reverse of right triangle : ");
			for(int i=1; i<=4; i++)
			{
				for(int j=4; j>=i; j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}

			System.out.println("--------------------");

			System.out.println("3. up and down right triangle : ");
			for(int i=1; i<=4; i++)
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}			
			for(int i=1; i<=3; i++)
			{
				for(int j=3; j>=i; j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}

			System.out.println("--------------------");

			System.out.println("4. reverse up and down right triangle : ");
			for(int i=1; i<=4; i++)
			{
				for(int j=3; j>=i; j--)
				{
					System.out.print(" ");
				}
				for(int k=1; k<=i; k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=1; i<=3; i++)
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print(" ");
				}
				for(int k=3; k>=i; k--)
				{
					System.out.print("*");
				}
				System.out.println();
			}

			System.out.println("--------------------");

			System.out.println("5. left triangle : ");
			for(int i=1; i<=4 ;i++)
			{
				for(int j=3; j>=i; j--)
				{
					System.out.print(" ");
				}
				for(int k=1; k<=i; k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}

			System.out.println("--------------------");

			System.out.println("6. reverse left triangle : ");
			for(int i=1; i<=4 ;i++)
			{
				for(int k=1; k<i; k++)
				{
					System.out.print(" ");
				}
				for(int j=4; j>=i; j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}

			System.out.println("--------------------");

			System.out.println("7. pyramid : ");
			for(int i=1; i<=4; i++)
			{
				for(int j=3; j>=i; j--)
				{
					System.out.print(" ");
				}
				for(int k=1; k<=i; k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}

			System.out.println("--------------------");

			System.out.println("8. reverse pyramid : ");
			for(int i=1; i<=4; i++)
			{
				for(int j=1; j<i; j++)
				{
					System.out.print(" ");
				}
				for(int k=4; k>=i; k--)
				{
					System.out.print("* ");
				}
				System.out.println();
			}

			System.out.println("--------------------");

			System.out.println("9. up and down pyramid : ");
			for(int i=1; i<=4; i++)
			{
				for(int j=3; j>=i; j--)
				{
					System.out.print(" ");
				}
				for(int k=1; k<=i; k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			for(int i=1; i<=3; i++)
			{
				for(int j=1; j<i; j++)
				{
					System.out.print(" ");
				}
				for(int k=3; k>=i; k--)
				{
					System.out.print(" *");
				}
				System.out.println();
			}
	}
}