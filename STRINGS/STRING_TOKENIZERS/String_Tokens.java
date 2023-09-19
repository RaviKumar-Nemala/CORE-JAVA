
import java.util.StringTokenizer;
public class String_Tokens {
     
     public static void main(String[] args) {
          //string tokenizer are presented in the java.util package
          //used to divide the string into the tokens(small parts)
          StringTokenizer st = new StringTokenizer("ravi kumar target 90"); //default delimeter is the space it divide the string on the basis of the space
          int no_of_tokens = st.countTokens();//returns the integer (specifies the no of pieces  that the main string has divided);
     
          System.out.println(no_of_tokens);

          //boolean hasMoreTokens() returns true when the string tokens are available in the string tokenizer object
          boolean check ;

               while(st.hasMoreTokens() == true){
               System.out.println(st.nextToken());
               }

          StringTokenizer st1 = new StringTokenizer("PROJECT CONSPIRACIY " , " : "); //it divides on the baisis of the : 
          
          while(st1.hasMoreTokens())
          {
               System.out.println(st1.nextToken());
          }



          
     }
}
