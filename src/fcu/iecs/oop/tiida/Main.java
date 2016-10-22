package fcu.iecs.oop.tiida;
import java.util.Scanner;
public class Main 
{

	public static void main(String[] args) 
	{
		int num,i,j;
		System.out.printf("Please enter a number:\n");
		Scanner scanner = new Scanner(System.in);
		 num = scanner.nextInt();
		 NissanTiida NI = new NissanTiida();
		 
		for(i=1;i<=num;i++)
		{
			
			for(j=1;j<=num;j++)
			{
				NI.tiida();
			}
			System.out.printf("\n");
		}

	}

}
