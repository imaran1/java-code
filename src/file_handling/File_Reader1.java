package file_handling;

import java.io.*;
public class File_Reader1 {

	public static void main(String[] args)throws IOException {
		FileReader fr = new FileReader("Noor/Resume.txt");
		int i= fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
	}

}
