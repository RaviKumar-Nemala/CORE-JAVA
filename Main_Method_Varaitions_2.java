//it is possible to over load the main method 
//it is not possible to override the main method

public class Main_Method_Varaitions_2 {
     

     public static void main(String args[]) //this method is executed and execution is started from this method
     {

          System.out.println("INSIDE THE ACTUAL MAIN METHOD");
     }

     public static void main(int i , int j)
     {
          System.out.println("INSIDE THE OVERLOADED MAIN METHOD");

     }

     public static void main(char ch )
     {
          System.out.println("INSIDE THE OVERLOADED MAIN METHOD");

     }

     public static void main(float a , float b )
     {
          System.out.println("INSIDE THE OVERLOADED MAIN METHOD");

     }


}
