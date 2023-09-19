public class multiple_catch_1 {
     
     public static void main(String[] args) {
          //   imp : it is possible to provide the more catch blocks in the
/**
 * for the single try block 
 * **if there is any inheritance relation between exception classes then 
 * we must declare the catch blocks in such way it increases the inheritance relation
 * means first specify the sub class catch block then specify the super like this 
 * if there is no inheritance  relation is specified then you can specify as you want
 * 
 */
          //below is the valid option it increases the inheritance relation
          try
          {

          }
          catch (ArithmeticException e)
          {

          }
          catch(RuntimeException r)
          {

          }
          catch(Exception a)
          {

          }




          /**
           * INVALID RELATION specify
           * 
           *  
           try
          {

          }
          catch (Exception e)//if any exception which has thrown by the try is directly received by this exceptioon because of we can catch exception either we specify the exact class name or the super class exception is super class then it receive all the exceptions then there is no need to write the subclass exception even if you write only super class catch block is executed
          {

          }
          catch(RuntimeException r)
          {

          }
          catch(ArithmeticException a)
          {

          }
           */
     }
}
