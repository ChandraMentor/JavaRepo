/* Program to accept input from user. This program uses
an utility class Scan.
Version : 1.0
Author  : Team - J
*/
public class testscan
{  
	public static void main(String args[]){
		int i;
		float f;
		double d;
		String s;
		System.out.println(" enter integer :");
		i=Scan.readInt();
		System.out.println(" Integer : " + i);
		System.out.println(" enter double :");
		d=Scan.readDouble();
		System.out.println(" Double : " + d);
		System.out.println(" enter float :");
		f=Scan.readFloat();
		System.out.println(" Float : " + f);
		System.out.println(" enter String :");
		s=Scan.readString();
		System.out.println(" String : " + s);
	}
}