/*Version : 1
This program prints the following pattern

*********
 *******
  *****
   ***
    *

using for construct
Author  : Team - J
*/
public class for6
{  
	public static void main(String args[]){
                int max=9,lines=5,spaces=0;
                int i=1,j,k;
                    for(i=0;i<lines;i++){
                        // print spaces first
                        for(k=0;k<spaces;k++)
                                System.out.print(" ");
                        for(j=0;j<(max- spaces*2);j++)
                                System.out.print("*");
                        spaces++;
                        System.out.println();
                     }
                
        }

}
