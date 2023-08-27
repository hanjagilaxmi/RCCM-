package file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Prgm3 {
	public static void main(String[] args) throws IOException {
		File f=new File("D:\\RCB\\vk.txt");
		FileReader fr=new FileReader(f);
		int size=(int)f.length();
		char arr[]=new char[size];
		fr.read(arr);
		String s=new String(arr);
		System.out.println(s);
	}

}
