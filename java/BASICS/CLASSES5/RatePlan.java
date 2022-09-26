abstract class RatePlan  { 
	private int x; 
	//An abstract method.
	public abstract int CalculateBill();
	// Non Abstract method.
	public  int CalculateBill2(int duration,int rate){
   return (rate * duration);
	}
}
 