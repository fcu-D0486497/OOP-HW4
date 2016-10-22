package fcu.iecs.oop.password;
import java.util.Scanner;

public class MAIN 
{

	public static void main(String[] args) 
	{
			String str = null;
			PasswordEncorder EN = new PasswordEncorder();
					
			Scanner scanner = new Scanner(System.in);
			System.out.printf("Please enter a password:\n");
			while(str != "exit")
			{
				
				str = scanner.next();
				str = EN.encoder(str);
				System.out.printf("%s",str);
			}
			
		

	}

}
