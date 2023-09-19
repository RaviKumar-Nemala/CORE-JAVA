interface I1
{
     int i  = 11 ; //BY DEFALUT IT IS public static final variable
     void m1(); // PUBLIC ABSTRACT by default
     void m2();
}

class C1 implements I1
{
     /*void m1()  
     {
          THIS IS ERROR BECUASE OF THE BY DEFAULT M1 SCOPE ON THE INTERFACE IS PUBLIC NO HERE THE IMPLEMENTATION SCOPE IS DEFAULT 
          SUB CLASS SCOPE IS LOWER OR THE WEAKER THEN THE SUPER CLASS METHOD SOCPE
          IN THE CONTEXT OF THE METHOD OVERRIDING OR THE INTERFACES
          SO THE DEFAULT SCOPE IS LESSER THEN THE PUBLIC SCOPE 
          SO IN THE CHILD WE MUST SPECIFY THE PUBLIC SCOPE 
     }*/
     public void m1() //correct
     {
          System.out.println("CHILD CLASS M1 METHOD");
     }
     public void m2()
     {
          System.out.println("CHILD CLASS M2 METHOD");
     }
}


public class Interfact_1 {
     public static void main(String[] args) {
          
     }    
}
