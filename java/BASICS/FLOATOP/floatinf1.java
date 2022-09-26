/* This  Program is a simple java Application to show
+ inf and - inf values and also NaN
Author : Team - J 
Version: 1.0*/

class floatinf1  { 
public static void main(String args[]){
	float pi = 1.0f,ni=-1.0f,nan;
	float a=0,b=Float.NaN;
	float pz,nz;
	int i;
	pi = pi/a;
	ni = ni/a;
	System.out.println( " NaN + some no = " + (b + 10.0));
	System.out.println( " + inf + some no = " + (pi + 10.0));
	System.out.println( " + inf - some no = " + (pi - 1000.101e30));
	System.out.println( " - inf - some no = " + (ni - 1000.101e30));
	System.out.println( " - inf + some no = " + (ni - 1000.101e30));
	System.out.println( " + inf +  - inf = " + (pi + ni));
	System.out.println( " + inf -  - inf = " + (pi - ni));
 }
}