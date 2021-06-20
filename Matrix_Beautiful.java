package matrix_Based;

public class Matrix_Beautiful {
	
	static void minOperation(int mat[][], int n) {
		int maxr=0, sumr=0,  maxc=0, sumc=0, sum=0; 
        for(int i =0;i<n;i++)
       {   sumr=0; sumc=0;
           for(int j=0;j<n;j++)
           {   sum+=mat[i][j];
               sumr+=mat[i][j];
               sumc+=mat[j][i];
           }
           if (sumr >maxr){
               maxr = sumr;
              // System.out.println("maxr: "+ maxr);
               //System.out.println("sumr: "+ sumr);
           }

           if (sumc>maxc)
           {
               maxc=sumc;
               //System.out.println("maxc: "+ maxc);
               //System.out.println("sumc: "+ sumc);
               
           }
           
       }
        //System.out.println("maxc: "+ maxc);
        System.out.println("maxr: "+ maxr);
       if(maxc>maxr)
       {
           maxr=maxc;
           
       }
       
      System.out.println( maxr*n-sum);
	}

	public static void main(String[] args) {
		int mat[][]= {{1,2,3},{4,2,3},{3,2,1}};
		int n=mat.length;
		Matrix_Beautiful.minOperation(mat, n);
	}

}
