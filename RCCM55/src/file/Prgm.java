package file;

import java.io.File;

public class Prgm {
	public static void main(String[] args) {
		File f=new File("D:\\RCB");
		if(f.mkdirs())
		{
			System.out.println("file is created");
		}
		else
		{
			System.out.println("File is not present");
		}
		if(f.exists())
		{
			System.out.println("file is existed");
		}
		else
		{
			System.out.println("File is not present");
		}
		/*if(f.delete())
		{
			System.out.println("file is deleted");
		}
		else
		{
			System.out.println("File is not present");
		}*/
			
	}

}
