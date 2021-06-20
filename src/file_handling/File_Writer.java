package file_handling;

import java.io.*;
public class File_Writer {
	public static void main(String[] args)throws IOException {
		 FileWriter fw = new FileWriter("Noor/Resume.txt");
		 fw.write("I am Imran Ansari And I am Software Engineer at Google.\nI am from Kushinagar Utter Pradesh.");
		 fw.flush();
		 fw.close();
	}
}
