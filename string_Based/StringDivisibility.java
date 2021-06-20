package string_Based;

public class StringDivisibility 
{	
	public static void main(String[] args) 
	{
		String s1 = "bcdbcdbcd", s2 = "bcdbcd";
		String s3 = "bcdbcdbcdbcd", s4 = "bcdbcd";
			
		String s5 = "aaaaaa", s6 = "a";
		String s7 = "wqzpuogsqcxpqizenbrhcbijieufuxgqpfijuobkqacjkdnzggijhqurwqyrnejckrnghqsyswhczwdicltjdndaebrtgcysulydcsbupkzogewkqpwtfzvjameircaloaqstsoiepynuvxmmthrsdcvrhdijgvzgmtzeijkzixtfxhrqpllspijwnsitnjazdwqzpuogsqcxpqizenbrhcbijieufuxgqpfijuobkqacjkdnzggijhqurwqyrnejckrnghqsyswhczwdicltjdndaebrtgcysulydcsbupkzogewkqpwtfzvjameircaloaqstsoiepynuvxmmthrsdcvrhdijgvzgmtzeijkzixtfxhrqpllspijwnsitnjazdwqzpuogsqcxpqizenbrhcbijieufuxgqpfijuobkqacjkdnzggijhqurwqyrnejckrnghqsyswhczwdicltjdndaebrtgcysulydcsbupkzogewkqpwtfzvjameircaloaqstsoiepynuvxmmthrsdcvrhdijgvzgmtzeijkzixtfxhrqpllspijwnsitnjazdwqzpuogsqcxpqizenbrhcbijieufuxgqpfijuobkqacjkdnzggijhqurwqyrnejckrnghqsyswhczwdicltjdndaebrtgcysulydcsbupkzogewkqpwtfzvjameircaloaqstsoiepynuvxmmthrsdcvrhdijgvzgmtzeijkzixtfxhrqpllspijwnsitnjazd";
		String s8 = "wqzpuogsqcxpqizenbrhcbijieufuxgqpfijuobkqacjkdnzggijhqurwqyrnejckrnghqsyswhczwdicltjdndaebrtgcysulydcsbupkzogewkqpwtfzvjameircaloaqstsoiepynuvxmmthrsdcvrhdijgvzgmtzeijkzixtfxhrqpllspijwnsitnjazdwqzpuogsqcxpqizenbrhcbijieufuxgqpfijuobkqacjkdnzggijhqurwqyrnejckrnghqsyswhczwdicltjdndaebrtgcysulydcsbupkzogewkqpwtfzvjameircaloaqstsoiepynuvxmmthrsdcvrhdijgvzgmtzeijkzixtfxhrqpllspijwnsitnjazd";
//		System.out.println(solve(s1, s2));
		System.out.println(solve(s3, s4));
//		System.out.println(solve(s5, s6));
//		System.out.println(solve(s7, s8));
	}

	private static int solve(String s1, String s2) 
	{
		if(s1.length() % s2.length() != 0)
			return -1;
		int l2 = s2.length();
		for(int i=0;i<s1.length();i++) 
			if(s1.charAt(i) != s2.charAt(i%l2))
				return -1;
		for(int i=0;i<s2.length();i++)
		{
			int j=0;
			for(; j<s2.length();j++) 
				if(s2.charAt(j) != s2.charAt(j%(i+1)))
					break;
			if(j == s2.length())
				return i+1;
		}
		return -1;
	}
}
