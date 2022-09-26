import java.util.*;

public class StackExample {
	static void showpush(Stack st, int a){
		st.push(new Integer(a));
		System.out.println(st);
		}
		static void showpop(Stack st){
		Integer a = (Integer) st.pop();
		System.out.print("  " + a + "   ");
		System.out.println(st);
		}
		public static void main(String args[]){
		  Stack st = new Stack();
		  System.out.println(st);
		  try  {
		  showpush(st,433);
		  showpush(st,402);
		  showpush(st,50);

		  while(!st.empty())
		  showpop(st);
		  }
		catch(EmptyStackException e)  {
		System.out.println("empty stack");
		   }
		  }
}