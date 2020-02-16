package gifttask;
import java.util.*;
import com.vnrvjiet.alekhya.ecart.utilities.*;
public class EcartEpamTask {
	public static void main(String args[])
	{ 
		System.out.println(".......welcome to E-cart......");
		int choice=1;
		Scanner sc=new Scanner(System.in);
		while(true) {
		try
		{
		
		System.out.println("1.Electronics 2.Clothes");
		do
		{
		System.out.println("choose your option");
		choice=sc.nextInt();
		}while(choice>=3||choice==0);
		break;
		}
		catch(Exception e)
		{
			sc.next();
		}
		}
		CartUtilities reference=new CartUtilities();
		switch(choice)
		{
		case 1:Electronics electronics=new Electronics();
		reference=electronics;
		break;
		case 2:Clothes clothes=new Clothes();
		reference=clothes;
		break;
		}
		String decision="y";
		do {
		System.out.println("1.DisplayItems 2.AddToCart 3.ViewCart");
		int option=1;
		while(true)
		{ try {
			do {
			System.out.println("Select option");
			option=sc.nextInt();
			}while(option>=4||option==0);
			break;
		}
		catch(Exception e)
		{
			sc.next();
		}
		}
		switch(option)
		{
		case 1:reference.displayitems();
		break;
		case 2:reference.addtocart();
		break;
		case 3:reference.viewcart();
		break;
		}
		while(true)
		{
		System.out.println("do u want to continue further y/n");
		 decision=sc.next();
		 if((!decision.equals("y"))&&(!decision.equals("n")))
			 continue;
		 else
			 break;
		}
		}while(decision.equals("y"));
	sc.close();		
	}

}
