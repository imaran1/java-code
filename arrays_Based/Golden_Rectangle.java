package arrays_Based;

import java.util.*;
public class Golden_Rectangle
{
    public static void main(String args[] ) throws Exception 
    {
    	List<Float> al = new ArrayList<Float>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        int n = sc.nextInt();
        int count=0;
        float w=0.0f;
        float h=0.0f;
        float ratio = 0.0f;
        while(n--!=0)
        {
        	w=sc.nextInt();
        	h=sc.nextInt();
        	if(w>h) ratio=w/h;
            else ratio=h/w;
            if(ratio>=1.6 && ratio<=1.7) count++;        
        }
        System.out.println(count);
    }
}
