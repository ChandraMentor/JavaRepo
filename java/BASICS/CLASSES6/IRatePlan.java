interface IRatePlan  { 
	/* some constants */
	int CONST =10;
	int x = 20;
	public abstract int CalculateBill();
	//public int CalculateBill1();
	//We cannot have  Non Abstract methods in Interfces
	//public  int CalculateBill2(int duration,int rate){
	//	return (rate * duration);
	//}
}
 