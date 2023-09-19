package INTRODUCTION;
class S
{
     int n_var = m1();
     {
          System.out.print("SUPER INSTATNCE BLOCK");
     }
     static int i = m1();
     S()
     {
          System.out.println("SUPER CLASS STATIC BLOCK CONSTRUCTOR");

     }
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
     int C_var = m1();
     {
          System.out.println("CHILD INSTANCE BLOCK");
     }
     static int c_j = m2();
     C()//if we don't provide the constructor then default constructor is exectued
     //but if we only provide the parameteralized constructor with out zero argument constructor then it is the error //
     //we must provide the zero argument constructor
     {
          System.out.println("CHILD CLASS STATIC BLOCK CONSTRUCTOR");
     
     }
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
     int Gs_Var = m3();

     {
          System.out.println("GRAND SON INSTANCE BLOCK");
     }
     Gs()
     {
          System.out.println("GRAND SON CONSTRUCTOR");

     }
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





public class Inhertance_Static_and_Instance {     
     public static void main(String args[])
     {
          Gs obj = new Gs();
     }
}
