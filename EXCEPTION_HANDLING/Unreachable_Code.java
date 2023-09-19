public class Unreachable_Code {

     public static void main(String[] args) {
          
          //any instructions which are specified after the throw key word
// then that instructions are called as the unreachableCode ;
// unreachableCode is also defines as after the infinite loop any instrucions are there 
// then that instructions are also unreachableCode if the condition on the loop is the constant condition not variable condition then we will get compilation error as the unreachable code


         /* throw new RuntimeException("hello");
          System.out.println("sdasdflkjafsd");//un reachable code
          */


          int i =10;
          int j = 0;
          int k = i/j;
          System.out.println(k); //this is not unreachable code becuause compiler does not know about this runtime exception
     }
}
