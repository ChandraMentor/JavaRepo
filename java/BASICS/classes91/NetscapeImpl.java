/* This class uses the netscape address book.
Author : Team - J 
Version: 1.0*/

class NetscapeImpl implements IAddressBook { 
	public String getName(int id){
		switch(id){
			case 1:
				return new String(" student 1");
			case 2:
				return new String(" student 1");
			default :
				return null;
		}
	}
	public String getAddress(int id){
		switch(id){
			case 1:
				return new String(" student1@inetsolv.com");
			case 2:
				return new String(" student1@inetsolv.com");
			default :
				return null;
		}
	}
//In real implementation we will using the logic which pulls the data from
//the address book managed by netscape.
}
 