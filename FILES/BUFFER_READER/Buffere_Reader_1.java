import java.io.*;

public class Buffere_Reader_1 {
     public static void main(String[] args) {

          try(BufferedReader br =  new BufferedReader(new InputStreamReader(System.in)))
          {

            String s =  br.readLine();
          int buf_char  = br.read();//it was able to read only one char at a time returns the ascii code 
            System.out.println(s);
            System.out.println((char)buf_char);

          }
          catch(Exception e)
          {

          }
     }


}
