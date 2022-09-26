class TenRandomNumbers {
public static void main(String args[]) {
int i = 0;
while(true) {
double d = Math.random();
if(d < .2 || d > .8)
continue;
System.out.println(d);
if(++i == 10)
break;
    }
  }
}