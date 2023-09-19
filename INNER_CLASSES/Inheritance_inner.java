class Outer
{

     void o1()
     {
          System.out.println("OUTER ");
     }
     class Inner
     {

          int i =  1;
          void check()
          {
               Child obj = new Child();//here i am checking that accessing the inner class from the another inner class
               obj.access();
          }
           Inner()
          {
          }
          void i1()
          {
               System.out.println("INNER METHOD ");
          }
     }
     class Child extends Inner{
          void access(){

          System.out.println(i);//valid
         i1();//if the i1 method has declare as the private then we cannot access that method`
          }

     }    
}

//class Second extends Inner //this is error we cannot access the inheritance relation of inner classes from the other outer classes 
//{
     
//}

class Second extends Outer{ //it is completely valid
     void access()
     {
          //we cannot access the inner class members we can
          //
         // only access the outer class members
         o1();
     }
}



public class Inheritance_inner {
     public static void main(String[] args) {
          Outer.Inner out = new Outer().new Inner();
          out.check();
          Second s  = new Second();
          s.access();
     }
}
