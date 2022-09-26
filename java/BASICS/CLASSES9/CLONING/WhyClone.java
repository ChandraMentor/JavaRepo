/* This class shows why cloning is important
*/

class WhyClone{ 
	int x =80;
	someprop sp;
	public WhyClone(int i,int j){
		sp= new someprop(i,j);
	}
	public void showstate(){
		sp.showstate();
		System.out.println(" x = " + x);
	}
	// this is a bad approach someprop is mutable class so there is a chance the
	// the internal state of WhyClone objects can be changed by calling mutators
	// of someprop
	public someprop getpart(){
		return ( sp) ; // we are return reference to same object
	}
	// The following is the right approach
	public someprop getpart2() throws CloneNotSupportedException{
		return ((someprop)sp.clone()) ; // we are return reference to same object
	}
	
}
 