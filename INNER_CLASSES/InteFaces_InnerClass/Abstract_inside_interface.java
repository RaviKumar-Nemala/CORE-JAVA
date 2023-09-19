interface Outer
{
     abstract class Inner//it is a class becaz it is inside of the interface
     {
         void m1()
          {
               System.out.println("m1 method");
          }
          void m2()
          {
               System.out.println("m2 method");
          }
          static void m3()
          {
               System.out.println("m3 method");

          }

        abstract   void a1();
          abstract void a2();
     }
     class Child extends Inner{
          void a1()
          {
               System.out.println("OVER RIDDEN METHOD");
          }
          void a2()
          {
               System.out.println("OVER RIDDEN METHOD 2");
          }
     }
}
public class Abstract_inside_interface {
 public static void main(String[] args) {
      
     Outer.Inner oc = new Outer.Child();
     oc.a1();
     oc.a2();
     oc.m1();
     oc.m2();
     
    // Outer.Child.a1();//not possible only possible if explicitly declare the inner class as the static class but the classes inside of the interfaces are static classes
     Outer.Inner.m3();//ok m3 explicitly designed as the static method
 }    
}
