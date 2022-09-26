/* This class uses the out look address book.
Author : Team - J 
Version: 1.0*/

class OutLookImpl implements IAddressBook { 
	public String getName(int id){
		switch(id){
			case 1:
				return (new String(" student one"));
			case 2:
				return (new String(" student two"));
			default :
				return null;
		}
	}
	public String getAddress(int id){
		switch(id){
			case 1:
				return new String(" studentone@inetsolv.com");
			case 2:
				return new String(" studenttwo@inetsolv.com");
			default :
				return null;
		}
	}
//In real implementation we will using the logic which pulls the data from
//the address book managed by outlook express.
}
 