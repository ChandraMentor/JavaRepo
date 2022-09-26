import java.util.*;
public class TreeMapDemo {
	public static void main(String[] args)	{
		TreeMap hm=new TreeMap();
		hm.put(" Splender",new Double(345678.98));
		hm.put(" TVS suzuki",new Double(249678.18));
		hm.put(" Victor plus",new Double(145688.96));
		hm.put(" Pulser DTSi",new Double(7455783.26));
		hm.put(" Passion+",new Double(325978.13));
		hm.put("Splender", new Double(345678.98));
		Set set=hm.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
		System.out.println();
		// going to deposit into Splender account
		double balance=((Double)hm.get("TVS suzuki")).doubleValue();
		hm.put("Splender",new Double(balance+1000));
		System.out.println("Splender's New Balance: "+hm.get("TVS suzuki"));
	}
}