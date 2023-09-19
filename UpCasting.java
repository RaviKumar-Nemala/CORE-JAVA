
//UPCASTING : ASSIGNING THE SUB CLASS REFERNCE VALUE TO THE SUPER CLASS REFERNECE VARIABLE IT IS CALLED AS THE UP CASTING.



class Parent
{
     void p1()
     {
          System.out.println("PARENT CLASS");
     }
}

class Child extends Parent
{
     void c1()
     {
          System.out.println("CHILD CLASS");
     }
}
public class UpCasting {
     
     public static void main(String[] args) {
          Child obj = new Child();
          Parent p = obj; //UPCASTING 
          Parent p1 = new Child();//UPCASTING
          p1.p1();
          p.p1();
     }
}
