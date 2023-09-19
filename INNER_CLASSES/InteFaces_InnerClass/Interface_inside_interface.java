interface Outer
{
     interface Inner     //defaultly it is static inner class
     {
          void m1();
          void m2();
     }
     class Child implements Inner //defaultly it is static inner class
     {
          public void m1()
          {
               System.out.println("m1 method");
          }
          public void m2() 
          {
               System.out.println("M2 METHOD ");
          }
     }
}


public class Interface_inside_interface {
     public static void main(String[] args) {
         Outer.Child oi =  new Outer.Child();

         // Outer.Child oc = new Outer.Inner();
         Outer.Inner _oi = new Outer.Child();

         
     }
}
