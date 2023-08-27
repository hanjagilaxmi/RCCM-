package file;

import java.io.File;
import java.io.IOException;

public class Prgm1
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("D:\\RCB\\vk.txt");
		if(f.createNewFile())
		{
			System.out.println("File is created");
		}
		else
		{
			System.out.println("File is already present");
		}
	}
}
