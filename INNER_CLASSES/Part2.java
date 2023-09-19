/* MEMBER INNER CLASS:
declaring the inner class in the non-static outer class is called as the 
member inner class*/


class Outer
{
     static 
     {
          System.out.println("STATIC OUTER ");
     }

     {
          System.out.println("OUTER CLASS");
     }
      class Inner
     {
          //STATIC DECLARATION IS NOT POSSIBLE INSIDE OF THE MEMBER INNER CLASS
          //but STATIC WITH THE FINAL SCOPE IS POSSIBLE
         // static int i = 11;//ERROR
          static final int i1  = 11;  //valid

          {
               System.out.println("inner class");
          }
     }
}




public class Part2 {
     public static void main(String[] args) {
          Outer.Inner o =  new Outer(). new Inner();
          Outer obj = new Outer();
     }
}
