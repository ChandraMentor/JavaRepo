import java.util.*;

class PushPop2 {

  public static void main(String args[]) {

    // Create stack
    Stack stack = new Stack();

    // Push non-duplicate elements onto stack
    for(int i = 0; i < args.length; i++) {
      Object obj = new Integer(args[i]);
      if(stack.search(obj) == -1) 
        stack.push(obj);
    }
    
    // Pop elements from stack and display
    while(!stack.empty()) {
      Object obj = stack.pop();
      System.out.println(obj);
    }
  }
}