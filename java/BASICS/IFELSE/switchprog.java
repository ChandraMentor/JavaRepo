/* Program using "switch" construct
Author : Team - J 
Version: 1.0*/

class switchprog { 
	public static void main(String args[]){
		int i;
                i=1;
                System.out.println("enter a no");
                i=Scan.readInt();
                 System.out.println(i);
                switch(i){
                        case 1:
                                System.out.println("one");
                                break;
                        case 2:
                                System.out.println("two");
                                break;
                        case 3:
                                System.out.println("Three");
                                break;
                       default:
                                System.out.println(" NaN ");
                                break;
                }
	}

}
