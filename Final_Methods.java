

class Super_Class
{
     void access() //here if we specify the final we cannot over ride on the child 
     {
          System.out.println("INSIDE OF THE SUPER CLASS METHOD ");
     }
}
class Child extends Super_Class
{
     final void access() //we get a error becuase of the final methods cannot be over riden
     {
          System.out.println("INSIDE OF THE CHILD CLASS METHOD ");
     }
     
}

/*class Grand_Child extends Child
{
     final void access() //we un comment it we get a error
     {

     }
}*/

public class Final_Methods {
     
     public static void main(String args[])
     {    
         
     }

     
}
