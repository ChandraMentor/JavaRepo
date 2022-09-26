import java.util.*;

class CitiesCountries { 

  public static void main(String args[]) {

    Hashtable ht = new Hashtable();
    ht.put("Tokyo", "Japan");
    ht.put("Beijing", "China");
    ht.put("Bangkok", "Thailand");
    ht.put("Taipei", "Taiwan");
    ht.put("Shanghai", "China");
    ht.put("Seoul", "South Korea");
    ht.put("Bombay", "India");
    
    if(args.length == 0) {
   System.out.println("Supply the name of a city as " +
        "a command line argument!");
      return;
    }

    String city = args[0];
    String country = (String)ht.get(city);

if(country != null) 
System.out.println(city + " is located in " + country);
    else
 System.out.println(city + " is not located in the hashtable");
  }
}


     
