import java.io.*;
import java.util.*;
public class Buffered_Reader_3 {

     static void writeContent()throws Exception
     {
          FileWriter fo = new FileWriter("C:/Users/Bhanusivateja/hi.txt" ,true);
          
          String s ="\nHELLO HI THERE";
          fo.write(s);
          s = "\nHELLAFJ  ALJF DLK";
          fo.write(s);
          //fo.write(s.getBytes());
          fo.close();
     }
     public static void main(String[] args) {

          List<String>str = new ArrayList<String>();
         try( 
          FileReader fi = new FileReader("C:/Users/Bhanusivateja/hi.txt");//semiclon has to specify not the comma
          BufferedReader br = new BufferedReader(fi)
          )
          {
          writeContent();
          //int temp = br.read();
          /*
          while(temp!=-1)
          {
               s +=(char)temp;
               temp= br.read();
          }
          */
          String res = "";
          while((res = br.readLine())!=null)
          {
               str.add(res);
          }
          
          for(String temp : str)
          {
               System.out.println(temp);
          }

          

     }
     catch (Exception e)
     {
          e.printStackTrace();
     }
     finally
     {
         // System.out.println(s);
     }

}

}
