package test_p45;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p45 
{
	public static void main(String[] arges)throws IOException
	{
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ոݔ���傀�˵ķ֔�");
		int test[] = new int[5];
				
		for(int i=0;i<test.length;i++)
		{	
			String str = br.readLine();
			test[i]=Integer.parseInt(str);
		}
		for(int s=0;s<test.length-1;s++)
		{
			for(int t=s+1;t<test.length;t++)
			{
				if(test[t]>test[s])
				{
					int tmp = test[t];
					test[t] = test[s];
					test[s] = tmp;
				}
			}
		}
		for(int i=0;i<test.length;i++)
		{
			System.out.println("��"+(i+1)+"���ķ֔�"+test[i]);
		}
		
	}


}