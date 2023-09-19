import java.io.*;

public class temp {
     public static void main(String[] args) throws Exception{
          BufferedReader  br  = new BufferedReader(new InputStreamReader(System.in));
          String s = "";
          String s1 = "";

          //   continuously taking the input from the keyboard 
          outer:
          do
          {
               s += br.readLine();
               if(s.contains("STOP") || s.contains("stop"))
               {
                    break outer;
               }
          }while(true);
          s = s.replace("stop","");
          s = s.replace("STOP" , "");
          System.out.println(s);
     }
}
