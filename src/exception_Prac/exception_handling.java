package exception_Prac;

class exception_handling 
{
    public static void main(String args[]) 
    {
    	int n = args.length;
    	System.out.println(n);
        try 
        {
            int a = args.length;
            int b = 10 / a;
            System.out.print(a);
        }
        catch (ArithmeticException e) 
        {
                System.out.println("1");
        }
    }
}