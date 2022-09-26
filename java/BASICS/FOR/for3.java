/*Version : 1
This program displays a pattern
&&&&&&&&&&&&&&
 &&&&&&&&&&&&
&&&&&&&&&&&&&&
 &&&&&&&&&&&&
&&&&&&&&&&&&&&
 &&&&&&&&&&&&
&&&&&&&&&&&&&&
using for construct
Author  : Team - J
*/
public class for3
{  
	public static void main(String args[]){
                int no=10;
                int i=1,j;
                        for(i=1;i<10;i++)
                        {
                           if ( (i %2 ) == 0)
                                System.out.print(" ");
                           else
                                System.out.print("&");
                           
                           for(j=2;j <10;j++)
                                System.out.print("&");

                           if ( (i %2 ) == 0)
                                System.out.print(" ");
                           else
                                System.out.print("&");
                           System.out.println();
                        }
                
        }

}
