class S
{
     static 
     {
          System.out.println("STATIC SUPER CLASS");
     }

     {
          System.out.println("INSTANCE SUPER CLASS");
     }

}


class C extends S
{

     static 
     {
          System.out.println("STATIC CHILD CLASS");
     }

     {
          System.out.println("INSTANCE CHILD CLASS");
     }
}

class Gs extends C
{
     static 
     {
          System.out.println("STATIC GRAND SON CLASS");
     }

     {
          System.out.println("INSTANCE GRAND SON CLASS");
     }
}



public class Inheritance_Static_Context {
     
     public static void main(String args[])
     {
          Gs obj = new Gs();
          // Gs obj_2 = new Gs(); //static context will be loaded only at once 
     }
}
