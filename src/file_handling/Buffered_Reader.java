package file_handling;

import java.io.*;
public class Buffered_Reader {

	public static void main(String[] args)throws IOException {
		File file = new File("noor.txt");
		FileReader fr = new FileReader(file);
		System.out.println(fr.read());
		BufferedReader br = new BufferedReader(fr);
		while(br.ready()) {
			System.out.println(br.readLine());
		}
	}

}
