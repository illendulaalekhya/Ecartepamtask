package com.vnrvjiet.alekhya.ecart.utilities;
import java.util.*;
public class CartUtilities {
	Scanner sc=new Scanner(System.in);
	int carteachitemscount[]=new int[4];
	   int costofproducts[]=new int[4];
	   String items[]=new String[4];
	public void displayitems()
	   {
		   
		   System.out.println("ElectronicItems");
		 for(int i=0;i<items.length;i++)  
		 {
			 System.out.println(i+1+"."+items[i]+" "+"Rs: "+costofproducts[i]);
		 }
	   }
	   public void addtocart()
	   {  displayitems();
		  System.out.println("Enter an item to add to cart");
		  int c=sc.nextInt();
		  carteachitemscount[c-1]++;
	   }
	   public void viewcart()
	   { int totalcost=0;
		  for(int i=0;i<4;i++)
		  {
			  if(carteachitemscount[i]!=0)
			  {
				  System.out.println(items[i]+" "+"price: Rs-"+carteachitemscount[i]*costofproducts[i]+" "+"Quantity: "+carteachitemscount[i]);
				  totalcost=totalcost+carteachitemscount[i]*costofproducts[i];
			  }
		  }
		  System.out.println("TotalCost: "+totalcost);
	   }

}
