package file_handling;

import java.io.*;
public class FileProperty {

	public static void main(String[] args)throws IOException 
	{
		 File file = new File("Noor");
		 file.mkdir();
		 File f = new File(file, "Resume.txt");
		 f.createNewFile();
		 System.out.println(f);
		 System.out.println(file);
		 String [] str = file.list();
		 for(String s1 : str)
			 System.out.println(s1);
	}
}
