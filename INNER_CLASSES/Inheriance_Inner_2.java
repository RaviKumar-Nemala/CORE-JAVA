class Outer{

     int i = 9;
     void o1()
     {
          System.out.println("OUTER CLASS METHOD ");
     }

     /*class Inner 
     {
          void inner_outer_access(){
          o1();//we cannot access the o1 method by creating the object fo the inner class
          //if we want to access the o1 method by inner ref_var then
          //you should extends the inheritance
          }
     }*/

     class Inner extends Outer{ 

     }

}

class Second{
     class Child extends Outer //but we cannot extend the inheritance of  inner class in the outer class from  other  class
     {
          void access()
          {
               System.out.println(super.i);
               o1();
          }
     }
}


public class Inheriance_Inner_2 {
     public static void main(String[] args) {
          //IN ORDER TO ACCESS THE OUTER CLASS MEMBERS FROM THE INNER CLASS ref_Var
           // THEN YOU SHOULD MAKE INHERITANCE RELATION BETWEEN THEM
           Outer.Inner oi= new Outer().new Inner();
          oi.o1();//o1 is outer class member we can directly accessing it

          Second.Child s = new Second().new Child();
          s.access();
          s.o1();
     }
}
