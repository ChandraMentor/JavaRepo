class SwapDemo1 
{
	public static void main(String[] args) 
	{
		int a,b;
		try {
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
        a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("the swapped values are" + a + " " + b);
		}
		catch(Exception e) {
		System.out.println("Invalid Input");
		}

	}
}
