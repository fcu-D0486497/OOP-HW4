package fcu.iecs.oop.password;

public class PasswordEncorder 
{
	public String encoder(String str) 
	{
		int i;
		char CH[] = str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			if(CH[i] == 'A' || CH[i] == 'a')
			{
				CH[i] = '4';
			}
			else if(CH[i] == 'E' || CH[i] == 'e')
			{
				CH[i] = '3';
			}
			else if(CH[i] == 'I' || CH[i] == 'i')
			{
				CH[i] = '1';
			}
			else if(CH[i] == 'O' || CH[i] == 'o')
			{
				CH[i] = '0';
			}
			else if(CH[i] == 'T' || CH[i] == 't')
			{
				CH[i] = '7';
			}
		}
		str = new String(CH);
		
		return str;
	}
}
