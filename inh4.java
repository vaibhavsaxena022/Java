import javax.swing.*;

class staff
{
	private int code;
	private String name;
	public void accept()
	{
		code = Integer.parseInt(JOptionPane.showInputDialog("staff code : "));
		name = JOptionPane.showInputDialog("staff name : ");
	}
	public void display()
	{
		System.out.println("staff code : "+code);
		System.out.println("staff name : "+name);
	}
}
class teacher extends staff
{
	private String subject;
	private String publications;
	public void accept()
	{
		super.accept();
		subject = JOptionPane.showInputDialog("subject : ");
		publications = JOptionPane.showInputDialog("publications : ");
	}
	public void display()
	{
		super.display();
		System.out.println("subject name : "+subject);
		System.out.println("publications : "+publications);
	}
}
class typist extends staff
{
	private int typist;
	public void accept()
	{
		typist = Integer.parseInt(JOptionPane.showInputDialog("typist : "));
	}
	public void display()
	{
		System.out.println("typist : "+typist);
	}
}
class officer extends staff
{
	private char grade;
	public void accept()
	{
		grade = JOptionPane.showInputDialog("grade : ").charAt(0);
	}
	public void display()
	{
		System.out.println("grade : "+grade);
	}
}
class casual extends typist
{
	private int wages;
	public void accept()
	{
		super.accept();
		wages = Integer.parseInt(JOptionPane.showInputDialog("daily wages : "));
	}
	public void display()
	{
		super.display();
		System.out.println("daily wages : "+wages);
	}
}
public class inh4
{
	public static void main(String[] args) 
	{
		teacher t = new teacher();
		officer o = new officer();
		casual c = new casual();

		t.accept();		o.accept();		c.accept();
		t.display();	o.display();	c.display();
	}
}