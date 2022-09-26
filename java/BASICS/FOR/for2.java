/*Version : 1.0
Program to compute x pow 1 /1 ! + x pow 2 / 2! + x pow 3/ 3!
using for construct
Author  : Team - J
*/
public class for2
{  
	public static void main(String args[]){
                int i,j,no=3;
                float sum=1.0f;
                int prod,nopowx;
                for(i=1 ; i<5;i++){
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
        }

}
