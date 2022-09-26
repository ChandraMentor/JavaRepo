/* This  Program is a simple java Application to show
+ inf and - inf values and also NaN
Author : Team - J 
Version: 1.0*/

class floatinf  { 
public static void main(String args[]){
	float pi = 1.0f,ni=-1.0f,nan;
	float a=0,b=Float.NaN;
	float pz,nz;
	int i;
	//b=0/0; see what happens
	nan=a/a; //let us see the result of this operation
	System.out.println(" 0/0  = " +nan);
	pi=(pi/a);
	System.out.println(" 1.0/0.0 " + pi); //+inf
	ni=(ni/a);
	System.out.println(" -1.0/0.0 " + ni); //- inf
	//special characteristics of floats
	System.out.println(" A very small float no * some  float no = " + (-3.40282356E+38F* 	2));
	System.out.println(" A very big float no * some  float no = " + (3.40282356E+38F* 	2));
	if (ni < -3.40282356E-40F)
	System.out.println(" negative inf less than any negative no");
	if (ni < pi)
	System.out.println(" negative inf less than positive inf");
	if (pi > 3.40282356E+38F)
	System.out.println(" positive inf is greater than any positive no");
	pz=0.0F;
	nz=-0.0F;
	if(nz == pz)
	System.out.println("negative zero is equal to positive zero");
	System.out.println("nan == positive inf " + ( nan == pi));
	System.out.println(" NaN !=Positive inf " + (nan != pi));
	b=pi * 0.0F; //nan
	System.out.println("pi * 0 =" + b);
	b=ni * 0.0F; //nan
	System.out.println("ni * 0 =" + b);
	System.out.println("pi * 0 =" + b);
	System.out.println(" NAN< 10.2F  "+ (b < 10.2F));
	System.out.println("NaN < 10.2F  "+ (b < 10.2F));
	System.out.println("NaN <= 10.2F  "+ (b <= 10.2F));
	//according java specification this should return false.
	System.out.println("NaN > 10.2F  "+ (b > 10.2F));
	System.out.println("NaN >= 10.2F  "+ (b >= 10.2F));
	b=1.3e-44f;
	System.out.println(b + " * 0.0001  =" + ( b * 0.0001f));
	
 }
}