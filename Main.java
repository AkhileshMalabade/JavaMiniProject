package shopManagment1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//ShopManagment.ShopDetails();
		Scanner sc = new Scanner(System.in);
		File f = new File("MyFile.txt"); 
		char option2 =' '; 
		do {
		System.out.println("1: Register\n2: Login");
		int option = sc.nextInt();
		switch(option)
		{
		case 1: System.out.println("Enter Username & Password & Role To Register");
		UserDetails userDetails = new UserDetails();
		userDetails.setUserName(sc.next());
		userDetails.setPassword(sc.next());
		userDetails.setRoll(sc.next());
		FileOutputStream fout = new FileOutputStream(f,true);
		if(f.length()==0)
		{
			ObjectOutputStream o = new ObjectOutputStream(fout);
			o.writeObject(userDetails);
			o.close();
		}
		else
		{
		MyObjectOutputStream sout = new MyObjectOutputStream(fout);
		sout.writeObject(userDetails);
		sout.close();
		}
		break;
		case 2: System.out.println("Enter Username & Password To Login");
		UserDetails userDetails1 = new UserDetails();
		userDetails1.setUserName(sc.next());
		userDetails1.setPassword(sc.next());
		FileInputStream fout1 = new FileInputStream(f);
		ObjectInputStream sout1 = new ObjectInputStream(fout1);
		UserDetails userDetails2 = null;
		boolean flag = false;
		//do {
		while(fout1.available()!=0) {
		userDetails2 = (UserDetails)sout1.readObject();
		if(userDetails2.getUserName().equals(userDetails1.getUserName()) && userDetails2.getPassword().equals(userDetails1.getPassword()))
		{
			if(userDetails2.getRoll().equals("Owner"))
			{
				Owner o = new Owner();
				o.owner();
			}
			else
			{
				Seller s = new Seller();
				s.seller();
			}
			//flag = true;
			break;
		}
		//}while(userDetails2 != null);
		//if(flag==false) {
			//System.out.println("Invalid Credentials");
		//}
		break;
		}
		}
		System.out.println("Do You Want To Continue");
		option2 = sc.next().charAt(0);
		}while(option2=='y' || option2=='Y');
	}
}
