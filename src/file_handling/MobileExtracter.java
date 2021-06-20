package file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.regex.*;

public class MobileExtracter {

	public static void main(String[] args)throws Exception 
	{
		System.out.println("Hello");
		PrintWriter out = new PrintWriter("number.txt");
		System.out.println();
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		BufferedReader br = new BufferedReader(new FileReader("noor.txt"));
		String line = br.readLine();
		while(line !=  null)
		{
			Matcher m = p.matcher(line);
			while(m.find()) {
				out.print(m.group());
			}
			line=br.readLine();
		}
		out.flush();
	}

}
