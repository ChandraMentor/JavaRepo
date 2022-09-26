class usecar  { 
public static void main(String args[]){

car c1,c2;
Alto800 m81 = new Alto800(1020);
Swift m8d1 = new Swift(1000);

m81.brake();
m81.turn();
m81.opentank();

m8d1.brake();
m8d1.turn();
m8d1.opentank();


c1 = m81;
c2 = m8d1;

c1.brake();
c1.turn();
c1.opentank();

c2.turn();
c2.opentank();
 }
}
