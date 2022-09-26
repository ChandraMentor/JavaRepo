class Conn  { 
	private int connid;
    private String custname;

Conn(int connid,String custname){
this.connid=connid;
this.custname=custname;
	}
  int getId(){
 return connid;
	}
String  getName(){
return custname;
	}
	float calculateBill(int noofunits){
	return 0; 
	}
}