
//instance of operator is used to check weather the provided ref_var is belongs to the specified
//class name or not
class Parent
{

}
class Child extends Parent
{

}

public class part_1 {
     public static void main(String[] args) {
          Parent p = new Parent();
          Child c = new Child();
          if( p instanceof  Parent)
          {
               System.out.println("TRUE");
          }

          if( c  instanceof Child)
          {
               System.out.println("TRUE");
          }

         
               System.out.println( p instanceof Child); // since we cannot access the child class mathods from the parent ref val so it returns false

               Parent p1 = new Child();
               System.out.println(p1 instanceof Child);//due to the method overriding context it returns the true value
               System.out.println(p1 instanceof Parent);
     }
}
