import java.util.*;

class PushPop {
public static void main(String args[]) {
// Create stack
Stack stack = new Stack();
// Push elements onto stack
for(int i=0;i<args.length;i++) 
stack.push(new Integer(args[i]));
// Pop elements from stack and display
while(!stack.empty()) {
Object obj = stack.pop();
System.out.println(obj);
    }
  }
}