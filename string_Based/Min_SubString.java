package string_Based;

public class Min_SubString {
	
	  public static void MinWindowSubstring(String[] strArr) {
		    String N = strArr[0];  // String N = ahffaksfajeeubsne
		    String K = strArr[1]; // String K = jefaa
		    int min = Integer.MAX_VALUE;
		    String result = "";
		    for (int i = 0; i < N.length(); i++) {
		        StringBuilder match = new StringBuilder(K);
		        for (int j=i; j < N.length(); j++) {
		            if (match.toString().contains(String.valueOf(N.charAt(j)))) {
		                int index = match.indexOf(String.valueOf(N.charAt(j)));
		                match.replace(index, index + 1, "");
		                //System.out.println(match.toString());
		            }

		            if (match.length() == 0) {
		                if (j - i < min) {
		                    min = j - i;
		                    result = N.substring(i, j+1);
		                }
		                break;
		            }
		        }
		    }

		        System.out.println(result);
		  }

	public static void main(String[] args) {
		String str[]=new String[] {"ahffaksfajeeubsne", "jefaa"};
		//System.out.print(MinWindowSubstring(str));
		MinWindowSubstring(str);
		String str1 ="Noor";
		String str2 ="Imran";
		System.out.println(str1.toString().contains(String.valueOf(str2.charAt(2))));
		System.out.println(str2.charAt(2));
	}

}
