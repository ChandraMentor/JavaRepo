import java.util.*;
public class HashTableDemo {
	public static void main(String[] args)
	{
		Hashtable balance=new Hashtable();
		Enumeration names;
		String str;
		double bal;
		balance.put("Splender",new Double(34.56));
		balance.put("Victor",new Double(4.14));
		balance.put("Max 100R",new Double(23434.16));
		balance.put("Super Splender",new Double(11134.56));
		balance.put("Pulser DTSi",new Double(222234.56));
		names=balance.keys();
		while(names.hasMoreElements())
		{
			str=(String)names.nextElement();
			System.out.println(str+" : "+balance.get(str));
		}
		System.out.println();
		bal=((Double)balance.get("Victor")).doubleValue();
		balance.put("Victor",new Double(bal+1000));
		System.out.println("Victor New Balance"+balance.get("Victor"));
	}
}