package file_handling;

import java.io.*;
public class Buffered_Writer {

	public static void main(String[] args)throws IOException {
		File f = new File("noor.txt");
		f.createNewFile();
		System.out.println(f.exists());
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		FileReader fr = new FileReader("D:\\Resume\\MyResume.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(br.ready()) {
			bw.write(br.readLine());
			bw.newLine();
		}
	}

}
