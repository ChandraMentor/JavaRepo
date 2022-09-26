/*This program tries to handle the error gracefully without
		 abnormally terminating the program.
Author : Team - J 
Version: 1.0*/

class except7  { 
	// If the class file is not found then handle the error 
	// by displaying error message and returning 0
	public int Error(){
		int status = 0;
		try{
			Object o = Class.forName("xyz").newInstance();
			status = 1;
		}
		catch (Exception e){
			System.out.println("Please check the config files" + e);
		}
		catch (ClassNotFoundException e){
			System.out.println("Please check the config files" + e);
		}

	return status;
	}
	
	public static void main(String args[]){
		
		except1 e = new except1();
		// we are not handling the error here
		System.out.println(" before method call");
		System.out.println(" after method call  " + e.Error());
	}
}
 