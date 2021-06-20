package patterns;

public class PrintNumber {

	public static void main(String[] args) {
		String s1 = "noor";
        String s2 = "noor";
        System.out.println("s1==s2"+s1==s2);
        System.out.println(s1==s2);
		 for (int i = 1; i <=7; i++) 
	        {
	            for (int j = 1; j <= 7-i; j++)
	            {
	                //System.out.print(1);
	            }
	             
	            for (int j = 1; j <= i; j++)
	            {
	                //System.out.print(i);
	            }
	             
	            System.out.println();
	            
	        }
	}

}
