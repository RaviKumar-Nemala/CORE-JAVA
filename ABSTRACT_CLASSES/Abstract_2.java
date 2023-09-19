abstract  class Parent
{
     abstract void m1();
     abstract void m2();
     abstract void m3();
}

abstract class Child //IF WE DECALRE AS THE ABSTRACT THEN IT IS POSSIBLE TO DO NOT PROVIDE THE IMPLEMENTATION FOR ALL THE METHODS OF THE SUPER CLASS
{
     void m1() //providing the implementation for the m1 method and implementation for the m2 method is on the sub class
     {    
          System.out.println("CHILD ");
     }
     abstract  void m5();//it must be over ridden on the sub class
}

class G_C extends Child
{

      void m5()
     {
          System.out.println("GRAND CHILD");
     }
     //in the child class only one abstract method directly there  on the super class Child
     // so in this class we must provide the implementation for that method
     //remaining methods like m2 , m3 are optionla we may may not be provide the implementation

}

public class Abstract_2 {
     public static void main(String[] args) {
          

     }
}
