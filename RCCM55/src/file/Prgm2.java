package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Prgm2 {
	public static void main(String[] args)throws IOException
	{
		File f=new File("D:\\RCB\\vk.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("Hi, Good Mornong\n");
		fw.write("Dont miss the class\n");
		fw.flush();
		System.out.println("File is written");
		
	}
}
