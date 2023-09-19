
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class INPUT_STREAM_READER {
     public static void main(String[] args)throws Exception {

//INPUTSTREAM IS USED TO CONVER THE DATA FROM THE BYTES TO THE char
// it was able to take only one characther at at time.
         // BuffedReader br = new BuffedReader(new InputStreamReader(System.in));
          //here the "in " is the static vaibale in the system class this"in" is connected to the input devices to get the data 
          //in the form of the bytes( 0, 1 s) InputStreamReader is used to convert that byte oriented data into the Character
          //
          InputStreamReader ipr = new  InputStreamReader(System.in);

         // char ch   = (char)ipr.read();
          //System.out.println(ch);
          String s  = "";
          int temp = ipr.read(); //it returns the ascii only one it was able to read the one char at a time
          System.out.println((char)temp);
          
          ipr = new InputStreamReader(System.in);//if you want to take another char from console you need to specify it again
          temp = ipr.read();
          System.out.println((char)temp);
          


     }     

}
