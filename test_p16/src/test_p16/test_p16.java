package test_p16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p16 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Ոݔ��a����b");
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char letter = str.charAt(0);
		
		switch(letter)
		{
		case 'a':
		{	System.out.println("ݔ�����a");
			break;
		}
		case 'b':
		{
			System.out.println("ݔ�����b");
			break;
		}
		default:
		{	System.out.println("Ոݔ��a����b");
			break;
		}
	}
}
}