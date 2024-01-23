package shopManagment1;
import java.util.*;

public class ShopManagment {
	public static HashMap sd = new HashMap();
	public static void ShopDetails() {
		System.out.println("\n**************** Welcome To Shop69 **************\n");
		sd.put("Iphone 11", 39000);
		sd.put("Iphone 12", 49000);
		sd.put("Iphone 13", 59000);
		sd.put("Iphone 14", 69000);
		sd.put("Iphone 15", 79000);
		sd.put("Iphone 16", 89000);
		Set<String> key = sd.keySet();	
		int l =0;
		System.out.print("\n");
		for(String i:key)
		{
			l++;
			System.out.print(" "+l+":"+i+" :- ₹"+sd.get(i)+"      ");
			if(l%2==0)
			{
				System.out.print("\n\n");
			}
	}
}
}
