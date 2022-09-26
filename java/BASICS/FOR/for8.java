/*Version : 1
This program prints the following pattern
*
***
*****
*******
*********
using for construct
Author  : Team - J
*/
public class for8
{  
	public static void main(String args[]){
                int stars=1,lines=5;
                int i=1,j,k;
                    for(i=0;i<lines;i++){
                        for(j=0;j<(stars);j++)
                                System.out.print("*");
                        stars+=2;
                        System.out.println();
                     }
                
        }

}
