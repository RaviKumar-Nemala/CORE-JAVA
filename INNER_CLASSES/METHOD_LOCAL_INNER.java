
class Outer{
     
     void m1()
     {
          int j  = 11;
          class Method_Inner
          {
               
               int  i = 100;
               void t1()
               {
                    System.out.println(j);//possible to access the local variables of the methdos cannot possible to access this class variables from the  method with out creating the obj
                    System.out.println("t1 method in the method inner class");
               }

               Method_Inner()
               {
                    System.out.println("METHOD INNER CLASS CONSTRUCTOR");
               }
          }
         // System.out.println(i);//we can't access the variable which are inside of the inner class from the method even the class inside of the method
          Method_Inner obj = new Method_Inner();
          obj.t1();
          System.out.println(obj.i);//possible way
     }
}
public class METHOD_LOCAL_INNER {
 public static void main(String[] args) {
      Outer o = new Outer();
      o.m1();
 }    
}
