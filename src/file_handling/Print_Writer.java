package file_handling;

import java.io.*;

public class Print_Writer {

	public static void main(String[] args)throws IOException {
		//File file = new File("noor.txt");
		//file.createNewFile();
		PrintWriter  pw = new PrintWriter("noor.txt");
		pw.write('d');
		
	}

}
