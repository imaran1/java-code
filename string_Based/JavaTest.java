package string_Based;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
public class JavaTest 
{
	public static void main(String[] args)throws Exception
	{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Somethimg");
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> arr = new ArrayList<>();
        List<String> list = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedReader.close();
        System.out.println(arr);
        for(int k=0;k<(arr.size()/2);k++)
        {
        	String b = arr.get(k).set(1,"-");
        	System.out.println(b);
        }

	}

}
