class ProductAndSum {
public static void main(String args[]) {
    int sum = 0;
    int prod = 1;
for(int num = 1; num < 6; num = num + 1) {
sum = sum + num;
prod = prod * num;
    }
System.out.print("product and sum: " + prod + " " + sum);
  }
}