class S
{
     static int i = m1();
     static  
     {
          System.out.println("SUPER CLASS STATIC BLOCK");
     }
     static int m1()
     {
          System.out.println("INSIDE THE M1 METHOD IN THE SUPER CALSS");
          return 10;
     }
}


class C extends S
{
     static int c_j = m2();
     static 
     {
          System.out.println("CHILD CLASS STATIC BLOCK");

     }
     static int m2()
     {
          System.out.println("CHILD CLASS M2 ");
          return 8;
     }
}

class Gs extends C
{
     static int k = m3();
     static 
     {
          System.out.println("GRAND SON");
     }
     static int m3()
     {
          System.out.println("M3");
          return 99;
     }
}



public class Inheritance_Static_context_2 {
     
     public static void main(String args[]){
     Gs obj = new Gs();
     Gs obj2 = new Gs();
     Gs obj3 = new Gs();
     // Gs obj_2 = new Gs(); //static context will be loaded only at once 

     }
}
