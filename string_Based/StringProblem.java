package string_Based;

public class StringProblem {

	public static void main(String[] args)throws Exception 
	{
		String str1 ="imran";    //"hi ram, how are you, I think you are fine"; 
		//Output = "ram hi, you are how, fine are you think i"
		String[] str2 = str1.split(" ");
		System.out.println(str2[1]);
		char ch[]=str1.toCharArray();
		byte [] b = str1.getBytes(str1);
		for(int i=0; i<b.length-1; i++)
			System.out.print(b[i]+" ");
	}
}
 