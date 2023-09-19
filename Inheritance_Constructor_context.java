class S
{
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
public class Inheritance_Constructor_context {
     public static void main(String  args[]){
     Gs obj = new Gs();    
     Gs obj2 = new Gs();//in static context only one time static variables and static methods are executed where as the instance constext "n " no of times instance variables and the instance methods are executed it depends on the no of objects that we are creting 
     }
}
