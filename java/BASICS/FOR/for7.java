/*Version : 1.0
This program prints the following pattern
    *
   ***
  *****
 *******
*********
using for construct
Author  : Team - J
*/
public class for7
{  
	public static void main(String args[]){
                int stars=1,lines=5,spaces=5;
                int i=1,j,k;
                    for(i=0;i<lines;i++){
                        // print spaces first
                        for(k=0;k<spaces;k++)
                                System.out.print(" ");
                        for(j=0;j<(stars);j++)
                                System.out.print("*");
                        spaces--;
                        stars +=2;
                        System.out.println();
                     }
                
        }
}
