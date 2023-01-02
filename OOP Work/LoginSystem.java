import java.util.*;

class Test
{
	void emailAndPassword()
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Email = ");
		String email=ob.nextLine();
		System.out.print("Enter Password = ");
		String pass=ob.nextLine();
		
		if(email.equals("skkhatri948@gmail.com")&&pass.equals("khatri123"))
		{
			javax.swing.JOptionPane.showMessageDialog(null,"You are Successfully Login!");
		}
		else
		{
			javax.swing.JOptionPane.showMessageDialog(null,"Invalid Email/Password");
		}
	}
}		
class LoginSystem
{
	public static void main(String arg[])
	{
		Test ob=new Test();
		ob.emailAndPassword();
	}
}
