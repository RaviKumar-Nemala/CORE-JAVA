import java.util.Scanner;


class Land
{
     int length ;
     int width ;
     float price ;
     String landOwner;
     Scanner sc = new Scanner(System.in);
     void setOwner()
     {
          System.out.println("ENTER THE OWNER NAME : ");
          landOwner= sc.nextLine();
     }
     void setPrice()
     {
          System.out.println("ENTER THE PRICE: ");
          price= sc.nextFloat();
     }
}


class Fertilized_Land extends  Land
{
     float annualIncome;
     String agrigatedCrops[]  = new String [10];
     void set_TypeseOfCrops()
     {
          Scanner sc  = new Scanner(System.in);
          System.out.println("ENTER THE NUMBER OF CROPS ARE AGRIGATED IN A YEAR");
          int  n  = sc.nextInt();
          String temp = new String("");
          Scanner scanner = new Scanner(System.in);
          for(int i = 0 ;i  < n ;i  ++)
          {
               System.out.println( " " +i +"ST CROP    : ");
               String inputString = sc. nextLine();
               agrigatedCrops[i] = inputString;
               inputString = " ";
          }
     }

     void display()
     {
          //System.out.println();
     }
}

class Unfertilized_Land extends Land
{

}
public class Inheritance_1{

public static void main(String args[])
{
     Fertilized_Land obj = new Fertilized_Land();
     obj.set_TypeseOfCrops();
     obj.setOwner();
     obj.setPrice();
    // Fertilized_Land land = new Land();
     //land.set_TypeseOfCrops();
}

}