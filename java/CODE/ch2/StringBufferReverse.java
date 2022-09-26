import java.lang.*;

class StringBufferReverse {
public static void main(String args[]) {
StringBuffer sb1 = new StringBuffer("javasript");
sb1.append("java");
System.out.println(sb1);
StringBuffer sb2 = sb1.reverse();
System.out.println(sb2);
  }
}