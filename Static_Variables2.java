
class Sv{
     int i =1;
     static int s_Var = 4;
     static void access()
     {
          //this(3);//this stament is not allowed in static block
          //System.out.println(i);//we can't access the instance variables from the static methods in order to do like that we must create the object to it
          System.out.println(s_Var);
         int t=88;
          System.out.println(s_Var + " "+t);
        //`  normal_method();we can' access the normal methods from the static method/
          

     }
     void normal_method()
     {
          //we can access both static and instance variables from this normal method
          System.out.println(i + " "+s_Var);
          access();//we can able to access the static methods form the normal methods
     }
}


public class Static_Variables2 {
     
     public static void main(String args[])
     {
          //crete object and run it 
          //with nullptr reference to the class we can access the static methods
         // Sv obj = new Sv();
          //obj.access();
          //static int j = 11;//error cannot declare the static variables in the main method 
          Sv.access();

     }
}
