package exception_P;

class Test
{
	public static void main(String[] args)
	{
		System.out.println("ratan 1st class");
		System.out.println("ratan 2st class");
		System.out.println("ratan inter");
		System.out.println("ratan trainer");
		try
		{ //Exceptional code
			
			System.out.println("Imran"+(10/0));
			}
		catch (ArithmeticException ae)
		{ //alternate co
			System.out.println("ratan weds aruna");
			}
		System.out.println("ratan kids");
		}
	}