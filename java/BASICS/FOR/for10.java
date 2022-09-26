/*Version : 1.0
Program to show how multiple statements can be included in For init
using for construct
Author  : Team - J
*/
public class for10
{  
	public static void main(String args[]){
                int i,j,no=3,f=0,k=10;
                float sum=1.0f;
                int prod,nopowx;
                for(i=1,j=0,no=3 ; i<5;i++,f++,k+=99){
                     //find no power i
                     nopowx=no;
                     for(j=1;j<i;j++)
                        nopowx= nopowx * no;
                     System.out.println(" power = " + nopowx);
                        //find factorial of i
                           prod=1;
                           for(j=1;j<=i;j++){
                                prod=prod * j;
                           }
                   System.out.println(prod);
		sum=sum + nopowx/prod;
                }
                System.out.println(" sum = " + sum);
		 System.out.println(i + "   "  + j + "   " + f + "  " + k);
        }

}
