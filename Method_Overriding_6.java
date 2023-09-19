/*IN METHOD OVERRIDING THE ACCESS PRIVILAGE OF THE SUBCLASS 
METHOD IS SAME AS THE SUPER CLASS MEHTOD
OR THE WEAKER THEN THE SUPER CLASS MEHTOD ACCESS PRIVILAGE 
*/
// ACCESS PRIVILAGE IS MORE FOR  THE PRIVATE 
//ACCESS PRIVILAGE IS LESSER FOR THE PUBLIC
class Parent
{
     protected    void m1()
     {
          System.out.println("PARENT CLASS");
     }
     public void m2()
     {
          //inherited class method scope must be equal or the weaker then this method
     }

}
class Child extends Parent
{
     public  void m1()
     {
          System.out.println("CHILD CLASS");
     }

     /*private void m2()
     {    ERROR
          attempting to assign weaker access privileges
     }*/

}
public class Method_Overriding_6 {
     public static void main(String[] args) {
          
          Parent p = new Child();
          p.m1();
     }
}
