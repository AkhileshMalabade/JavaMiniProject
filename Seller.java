package shopManagment1;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Seller {

	public static void seller()
	{
		int i =0;
		int bill = 0;
		boolean exit=true;
		int[] ar = new int[100];
		Scanner sc = new Scanner(System.in);
		ShopManagment.ShopDetails();
		Set<String> key = ShopManagment.sd.keySet();
		String[] KeySetArray = key.toArray(new String[0]);

		System.out.println("************Choose Item To Add Into Cart*********");
		ar[i]=sc.nextInt();
		System.out.println("              *__Item Added Into Cart__*");
		System.out.println("_______________________________________________________\n");
		for(int j = 0;j<=i;j++)
		{
			String s1 = KeySetArray[ar[j]];
			int x = (int)ShopManagment.sd.get(KeySetArray[ar[j]]);
			System.out.printf("                 %-15s%03d %n",s1,x);
		}

		do {
			i++;
			System.out.println("1: Add Another Item     2:Payment\n3: Cancel Order");
			int next = sc.nextInt();
			if(next==1)
			{
				ShopManagment.ShopDetails();

				System.out.println("*************Choose Item To Add Into Cart**********");
				ar[i]=sc.nextInt();
				System.out.println("              *__Item Added Into Cart__*");
				System.out.println("_______________________________________________________\n");
				System.out.println("                  *__Total Items__*\n");
				for(int j = 0;j<=i;j++)
				{
					String s1 = KeySetArray[ar[j]];
					int x = (int)ShopManagment.sd.get(KeySetArray[ar[j]]);
					System.out.printf("                 %-15s%03d %n",s1,x);
				}

			}
			else if(next==2)
			{
				for(int k = 0;k<i;k++)
				{

					bill=bill+(int)ShopManagment.sd.get(KeySetArray[ar[k]]);
				}
				System.out.println("                  Total Amount : "+bill+"\n");
				System.out.println("*******************Choose Payment Mode***************************\n");
				System.out.println("         1: Cash     2: UPI     3: Cancel Payment");
				int Pay = sc.nextInt();
				String paymentmode = null;
				if(Pay==1)
				{
					 paymentmode = "Cash";
					
				}
				else if(Pay==2)
				{
					 paymentmode = "UPI";
				}
				System.out.println("Payment Done Sucessfully");
				System.out.println("1:Yes\n2:No");
				int PayDone = sc.nextInt();
				if(PayDone==1)
				{
					System.out.println("                    *__Shop69__*");                  
					System.out.println("---------------------------------------------------------");
					System.out.println("                   shop69@gmail.com\n\t    Ichalkaranji, Kolhapur 416115");
					System.out.println("---------------------------------------------------------");
					System.out.println("              Name                  Price");
					System.out.println("---------------------------------------------------------");
					
					for(int j = 0;j<i;j++)
					{
						String s1 = KeySetArray[ar[j]];
						int x = (int)ShopManagment.sd.get(KeySetArray[ar[j]]);
						System.out.println("          "+(j+1)+": "+s1+"              "+x);
						
					}
					System.out.println("---------------------------------------------------------");
					System.out.println("          Total Amount :            "+bill);
					System.out.println("---------------------------------------------------------");
					System.out.println("          Payment Mode : "+paymentmode);
					System.out.println("*********************************************************");
					System.out.println("                 THANK YOU COME AGAIN");
					System.out.println("*********************************************************");
					System.out.println("                SOFTWARE BY : AKHLIESH\n\n");
				}
				else if(Pay==3)
				{
					exit=false;
				}
			}
			else if(next==3)
			{
				exit=false;
			}
		}while(exit==true);		
	}
}
