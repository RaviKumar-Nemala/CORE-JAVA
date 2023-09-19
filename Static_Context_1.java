class Temp
{    
     static 
     {
          System.out.println("STATIC BLOCK ");
     }
     static int var = static_Method();

     int n = normal_Method();
     static int static_Method()
     {
          System.out.println("INSIDE THE M1 METHOD");
          return 1;
     }

     int normal_Method() 
     {
          System.out.println("NORMAL METHOD");
          return 9;
     }

     {
          System.out.println("INSTATNCE BLOCK");
     }



}


public class Static_Context_1 {
     
     public static void main(String args[])
     {
          Temp obj = new Temp();
          
     }

}
