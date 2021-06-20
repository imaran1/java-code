package association;

public class Patt {
	public static void main(String[] args) {
		int rows=5;
		for(int i=1; i<=5; i++) {
			int num=i;
			for(int j=1; j<=i; j++) {
				System.out.print(num+" ");
				num=num+rows-j;
			}
			System.out.println();
		}
	}
}
