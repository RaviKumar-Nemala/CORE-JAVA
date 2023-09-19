
class Parent
{    
     Parent()
     {
          super();//here the super class is the java.lang.Object class constructor
          System.out.println("PARENT CLASS CONSTRUCTOR");
     }
}
class Child extends Parent
{
      Child()
     {
          super();
          System.out.println("CHILD CONSTRUCTOR");
     }


     
}

class G_Child extends Child
{
     G_Child()
     {
          super();//if we don't refer the super internally compiler add the super statement to  this child class constructor as the first statement this is why parent class will exectued first //this is done if we don't specify the super construcotr explicily if we specify the super explictly then compiler will invoke that super statment only it will not append that default constructor
          System.out.println("G_CHILD CONSTRUCTOR");
     }
}



public class Super_Keyword_2 {
     
     public static void main(String[] args) {
          G_Child obj = new G_Child();
     }
}
