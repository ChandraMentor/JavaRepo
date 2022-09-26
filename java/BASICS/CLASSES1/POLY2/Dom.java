/* This  class is to represent domestic connection type
Author : Team - J 
Version: 1.0*/

class Dom extends Conn { 
		Dom(int connid,String custname){
			super(connid,custname);
		}
		float claculateBill(int noofunits){
		System.out.println(" u'r bill is calculated according to dom connection billing policy");
		return (noofunits * 2.5f);
	}
}