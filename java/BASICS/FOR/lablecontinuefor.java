/*Version : 1.0
Program to show how to use labled continue
using for construct
Author  : Team - J
*/
public class lablecontinuefor
{  
	public static void main(String args[]){
                int i,j,no=3,f=0,k=10;
                float sum=1.0f;
		lab1:
		System.out.println(" lable one");
		//lab1:
		//System.out.println(" lable one second time");
                int prod,nopowx;
		
		lab1:
	//while(true){
		//System.out.println(" in while");
		lab2:
                for(i=1; i<3;i++){
			
			System.out.println(" value of i = " +i);
			lab3:
                        for(j=1;j<=4;j++){
				System.out.println(" value of j = " + j);
                                if( j ==1)
					continue lab3;
				System.out.println(" After break lab3");
				if( j ==2)
					continue lab3;
				System.out.println(" After break lab3 ..");
				if( j ==3)
					continue lab1;
				System.out.println(" After break lab1");	
                           }
                 }
		//}
                
        }

}
