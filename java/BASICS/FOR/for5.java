/*Version : 1
This program uses break and continue
using for construct
Author  : Team - J
*/
public class for5
{  
	public static void main(String args[]){
                int no=10;
                int i=1,j;
                  outer_for:   for(j=0;j<10;j++){
                        for(i=1;i<10;i++)
                        {
                           if ( (i %2 ) == 0)
/*                                continue;*/
                                break outer_for;
                           System.out.println(i);
                        }
                     }
                
        }

}
