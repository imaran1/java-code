package string_Based;

public class StringA {
     
	public static void main(String[] args) 
	{
		String str ="edaiouekhtueoida"; // Output = "edeuoiakhtioeuda"
		int trueCount=0;
		int falseCount=0;
		boolean flag=false;
		String resStr ="";
		char ch [] = {'a','e','i','o','u'};
		for(int i=0; i<str.length()-1; i++) 
		{
			if(
					(
							(str.charAt(i)=='a' ||str.charAt(i)=='e' || str.charAt(i)=='i' ||
					        str.charAt(i)=='o' || str.charAt(i)=='u') &&
					(str.charAt(i+1)=='a' ||str.charAt(i+1)=='e' || str.charAt(i+1)=='i' ||
					 str.charAt(i+1)=='o' || str.charAt(i+1)=='u')
					)
				) 
			{
				for(int j=0; j<ch.length; j++) 
				{
					if(str.charAt(i)==ch[j]) {
						trueCount++;
						flag=true;
					}
				}
			}else {
				falseCount++;
				flag=false;
			}
			
			char [] falseChar = new char[falseCount];
			resStr = str.substring(0, falseCount+1);
			//System.out.println(resStr);
			
			
			if(!flag && trueCount> 1) {
				String s=str.substring(i-trueCount, i+1);
				//resStr = str.substring(falseCount);
				byte[] strAsByteArray = s.getBytes();
				byte[] result = new byte[strAsByteArray.length];
				 for (int k = 0; k < strAsByteArray.length; k++)
			            result[k] = strAsByteArray[strAsByteArray.length - k - 1];
				 String rev = new String(result);
				 resStr+=rev;
				 System.out.println(rev);
				//System.out.println(resStr);//edeuoia
				trueCount=0;
			}
		}
		//System.out.println(resStr);
	}

}
