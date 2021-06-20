package practice;

import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner scan=new Scanner(System.in);
	   int at=scan.nextInt();
	   float b=scan.nextFloat();

	   if(at%5==0 && at+0.50<=b){
 	   double c=(b-(at+0.50));
	      System.out.printf("%.2f",c);
	   }
	   else {
	      System.out.printf("%.2f",b);
	   }
	  
	}
}