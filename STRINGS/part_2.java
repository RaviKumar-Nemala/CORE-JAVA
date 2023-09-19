
import java.util.*;
public class part_2 {
     public static void main(String[] args) {

          byte arr[] = new byte[5];
          Scanner sc= new Scanner(System.in);
          
          for ( int i = 0 ;i  < 5 ; i ++)
          {
               arr[i] = sc.nextByte();

          }
          String s = new String(arr);//here values of the byte will be
          //converted into the char and those collection chars assing to the 
          //stringobj 

          System.out.println("string value : "  + s);


          //SECOND METHOD

          byte []arr2 ={65,66,67,68,69};

          // new String(byte_var , first_string, no_of_char_we need tostrore in the string );
          String str = new String(arr2 , 0 ,  4);
          //if we speciefy the lenght as the third paremeter as more then byte array size then it throws exceptionte
          System.out.println(str);


     }     
}
