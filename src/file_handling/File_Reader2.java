package file_handling;

import java.io.*;
public class File_Reader2 {

	public static void main(String[] args)throws IOException {
		File f = new File("D:\\Resume\\MyResume.txt");
		FileReader fr = new FileReader(f); 
		char[] ch = new char[(int)f.length()];
		fr.read(ch);
	    for(char ch1 : ch)
	    	System.out.print(ch);
	}
}
