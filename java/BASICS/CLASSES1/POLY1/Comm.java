class Comm extends Conn { 
Comm(int connid,String custname){
super(connid,custname);
	}
float claculateBill(int noofunits){
System.out.println(" u'r bill is calculated according to comm connection billing policy");
return (noofunits * 5);
	}
}