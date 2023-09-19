//by defalut the classes which are declared inside of the interfaces are going to the
//static classes 
interface Outer
{
     class Inner//it is a class becaz it is inside of the interface
     {
          void m1()
          {
               System.out.println("m1 method");
          }
          void m2()
          {
               System.out.println("m2 method");
          }
     }
}


public class Main_Outer_Interface_Inner_class {
     public static void main(String[] args) {
          Outer.Inner oi =  new Outer.Inner();  //this is valid because 
               //of the Inner class by default is static so the above syntax is static
          oi.m1();
          oi.m2();

        //  Outer.Inner.m1();

     }
}
