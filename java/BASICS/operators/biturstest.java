/* Program using bitwise operator with int data types
Author : Team - J 
Version: 1.0*/

class biturstest { 
	public static void main(String args[]){
		byte b=-128,x;
		System.out.println(" -128>>1 = " + (byte)(b >>1));
		System.out.println(" -128 >>>1 = " + (byte)(b >>>1));
		b=-1;
		System.out.println(" -1>>1 = " + (byte)(b >>1));
		System.out.println(" -1 >>>1 = " + (byte)(b >>>1));
		b=-3;
		System.out.println(" -3>>1 = " +(byte) (b >>1));
		System.out.println(" -3 >>>1 = " + (byte)(b >>>1));
		b=-33;
		System.out.println(" -33>>1 = " + (byte)(b >>1));
		System.out.println(" -33 >>>1 = " + (byte)(b >>>1));
		b=-108;
		System.out.println(" -108>>1 = " + (byte)(b >>1));
		System.out.println(" -108 >>>1 = " + (byte)(b >>>1));
		b=-19;
		System.out.println(" -199>>1 = " + (byte)(b >>1));
		System.out.println(" -199 >>>1 = " + (byte)(b >>>1));
		
	}	
}