package shopManagment1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class Owner{
	
	public static void owner() throws IOException, ClassNotFoundException 
	{	
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		do {
		System.out.println("\n1: Add\\Remove Item\n2: Price Control\n3: Switch To Seller\n4: Exit");
		int ar = sc.nextInt();
		if(ar==1)
		{
			System.out.println("1: Add Item\t2: Remove Item");
			int Ochoice = sc.nextInt();
			if(Ochoice==1)
			{
				System.out.println("Enter Item Name : ");
				String aditm = sc.next();
				System.out.println("Enter Price : ");
				int adpr = sc.nextInt();
				ShopManagment.sd.put(aditm,adpr);
				int l =0;
				System.out.print("\n");
				Set<String> key = ShopManagment.sd.keySet();
				for(String i:key)
				{
					l++;
					System.out.print(" "+l+":"+i+" :- ₹"+ShopManagment.sd.get(i)+"      ");
					if(l%2==0)
					{
						System.out.print("\n\n");
					}
				}
			}
			else if(Ochoice==2) 
			{
				System.out.println("Enter Item Name : ");
				String remitm = sc.nextLine();
				remitm = sc.nextLine();
				ShopManagment.sd.remove(remitm, ShopManagment.sd.get(remitm));
				System.out.println(ShopManagment.sd);
				int l =0;
				System.out.print("\n");
				Set<String> key2 = ShopManagment.sd.keySet();
				for(String i:key2)
				{
					l++;
					System.out.print(" "+l+":"+i+" :- ₹"+ShopManagment.sd.get(i)+"      ");
					if(l%2==0)
					{
						System.out.print("\n\n");
					}
				}
			}
		}
		else if(ar==2)
		{	
			System.out.println("Enter Discount Percentage : ");
			int per = sc.nextInt();
			Set<String> key = ShopManagment.sd.keySet();
			for(String i:key)
			{
				int temp = (int) ShopManagment.sd.get(i);
				ShopManagment.sd.replace(i, ShopManagment.sd.get(i),(temp*per)/100);
			}
			int l =0;
			System.out.print("\n");
			for(String i:key)
			{
				l++;
				System.out.print(" "+l+": "+i+" :- ₹"+ShopManagment.sd.get(i)+"      ");
				if(l%2==0)
				{
					System.out.print("\n\n");
				}
			}
		}
		else if(ar==3)
		{
			Seller s = new Seller();
			s.seller();
		}
		
		else if(ar==4)
		{
			exit=true;
		}
		}while(exit==false);
	}
}
