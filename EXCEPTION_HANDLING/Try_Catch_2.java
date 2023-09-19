
public class Try_Catch_2 {
     int access()
     {



     try
     {
        
          return 10;//it is not going to the final return value 
          // it is overridden with the finally block return value 
          //lastly finally block value is going to be returned

     }
     catch (Exception e)
     {
          return 20;
     }
     finally
     {
          return 30;
     }
     //return 40; //unreachable code 
}

     public static void main(String[] args) {
          Try_Catch_2 obj = new Try_Catch_2();
          System.out.println(obj.access());
     }
}
