

class Outer
{
      void o1()
     {
          System.out.println("OUTER CLASS");
          //i1() -->error
     }
     private void o2()
     {
          System.out.println("OUTER CLASS");
     }
     class Inner //during the compilation Outer$Inner.class file wil be genrated for this inner class
     {
          void i1()
          {
               System.out.println("INNER CLASS");
               o1();//it is possible to access the outer class methods from the inner classes
               //it is not possible to access the inner class members from the outer 
               //class
               o2(); // even the method is private it is also possible to access
          }


     }
}

public class Part1
{
     public static void main(String[] args) {
          Outer out = new Outer();
          //this is the basic syntax for creating the inner class objs
          Outer.Inner iner_obj = new Outer().new Inner();
          Outer.Inner iner_obj2 = out.new Inner();//it is also possible to create the inner class variable with the help of the outer class ref_var
          iner_obj.i1();

        //  iner_obj.o1();-->error we cannot access the methods of the outer classes with the help of the  inner class objects
        


     }
}