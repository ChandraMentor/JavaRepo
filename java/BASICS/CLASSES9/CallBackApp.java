/* This class file is to demonstrate how callback funstions can be called
Author : Team - J 
Version: 1.0*/

class CallBackApp { 
	public static void main ( String args[]){
		ICallMe icm = getCallBackInterface(1);
		icm.callme(); 
		icm = getCallBackInterface(2);
		icm.callme(); 
	
	}
	public static ICallMe getCallBackInterface (int i){
		if (i == 1){
			CallMeImpl obj = new CallMeImpl();
			return ((ICallMe) obj);
		}
		else{
			CallMeImplx obj = new CallMeImplx();
			return ((ICallMe) obj);
		}
	}
}
 