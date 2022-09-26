/* This program demonstrates the use of string class
Author : Team - J 
Version: 1.0*/

class UseString1 { 
	
	public static void main ( String args[]) throws Exception{
		
		String s1= new String (" String 1");
		String s2 = " String 2" , s3 = " String 2";
		// length method returns the length of string
		System.out.println("s2.length()  =" + s2.length());
		//Returns the character at the specified index
		System.out.println("s2.CharAt(1)  =" + s2.charAt(4));
		//getChars(int srcBegin,int srcEnd,char[] dst,int dstBegin)
		char c[] = new char[s1.length()];
		s1.getChars(0,s1.length(),c,0);
		int i;
		//printout the chars that are copied
		for(i=0;i <c.length;i++)
			System.out.print(c[i]);
		System.out.println();

		//public byte[] getBytes()
		byte b[] = s1.getBytes();
		for(i=0;i <b.length;i++)
			System.out.print(b[i]+"  ");
		System.out.println();
	
		//boolean equals(Object anObject)
		Object o = new Object();
		System.out.println("o.toString()  =" + o + "  s1.toString() ="+s1.toString());
		System.out.println("s1.equals(o)  =" + s1.equals(o));
		
		//boolean equalsIgnoreCase(String anotherString)
		System.out.println("s1.equalsIgnoreCase = "+ s1.equalsIgnoreCase(" sTRing 1"));
		
		//int compareTo(String anotherString)
		System.out.println("zz compared to a = "+ "zz".compareTo("a"));

		//public boolean regionMatches(int toffset,String other,int ooffset,int len)
		System.out.println("regionMatches "+ "abcabcabc".regionMatches(0,"abc",0,3));

		//regionMatches(boolean ignoreCase,..) can be used to match regions by ignoring case

		//startsWith(String prefix,int toffset)
		System.out.println("startsWith "+ "abcabcabc".startsWith("abc",0));
		
		//hashCode()
		System.out.println("abc.hashCode() "+ "abc".hashCode());
		
		//int indexOf(int ch)
		System.out.println("abc.indexOf('c') "+ "abc".indexOf('c'));

		//int lastIndexOf(int ch,int fromIndex)
		System.out.println("abccccc.lastIndexOf('c',4) "+ "abccccc".lastIndexOf('c',4));

		//int indexOf(String str)
		System.out.println("abcabc.indexOf bc "+ "abcabc".indexOf("bc"));

		//String substring(int beginIndex,int endIndex)
		String sub = "iNetSolv".substring(2,7);
		System.out.println("sub = "+ sub);

		//trim

		System.out.println(" string1 after trimming = " + s1.trim());
		
		//concat

		System.out.println(" after contating s1 with s2 " + s1.concat(s2));

		//static String valueOf(char[] data)
		System.out.println(" String constructed using valueof method" + String.valueOf(c));

		System.out.println(" String constructed using valueof(float)" + String.valueOf(100.00F));
	
		// public String intern() , very intresting method
		//All literal strings and string-valued constant expressions are interned. 
		String si = s1.intern();
			System.out.println(" si == s1 " + (si==s1));
		String s10 = "literal";
		String s11 = s10.intern();
			System.out.println(" s10 == s11 " + (s10==s11));
		String a = new String(s1);
			System.out.println(" a == s1 " + (a==s1));
		
	}
}
 