class Parent
{
     static void m1()
     {
          System.out.println("PARENT CLASS");
     }
     void m2()
     {

     }
}
class Child extends Parent
{
     static void m1()
     {
          System.out.println("CHILD CLASS");
     }

     /*
     void m1()
     {
          this is error
     }
     */

     /*

     static  void m2()
     {    
          //this error
     }*/

}



public class Method_Overriding_5
{
     public static void main(String[] args) {
          
          Parent p =new Child();
          p.m1();//PARENT CLASS METHOD HAS CALLED INSTEAD OF THE SUB CLASS METHOD THIS IS BECUASE OF THE STATIC METHODS DOES NOT SUPPORTS FOR THE METHOD OVER RIDING IT IS CALLED AS THE METHOD OVERHIDING
     }
}