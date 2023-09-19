import java.io.*;
import java.nio.Buffer;
import java.util.*;
public class Buffer_Reader_4 {
     
     void write_Data() throws Exception
     {
          FileWriter fo = new FileWriter("C:/Users/Bhanusivateja/source.txt");
          String s = "";
          BufferedWriter br = new BufferedWriter(fo);
          List<String>str = new ArrayList<String>();
          s = "KUMAR ";
          str.add(s);
        
          s = "FREUD ";
          str.add(s);
         
          s = "Nietzsche ";
          str.add(s);
         

          for(String s1:  str)
          {
               br.newLine();
              br.write(s1);
              
          }
          br.close();
          fo.close();
     }

     void printData() throws Exception
     {
          FileReader fr = new FileReader("C:/Users/Bhanusivateja/source.txt");
          BufferedReader br = new BufferedReader(fr);
          String temp =new String();
          while((temp = br.readLine())!=null)
          {
              System.out.println(temp);
          }
          fr.close();
     }

     void updataData() throws Exception
     {
          FileReader fr = new FileReader("C:/Users/Bhanusivateja/source.txt");
          BufferedReader br = new BufferedReader(fr);
          List<String>str  = new ArrayList<String>();

          String temp =new String();
          while((temp = br.readLine())!=null)
          {
               if(temp.equals("RAVI KUMAR"))
               {
                    temp = " UPDATED ";
               }
               str.add(temp);
          }
         
          // for(String s : str)
          // {
          //      System.out.println(s);
          // }
          FileWriter fw = new FileWriter("C:/Users/Bhanusivateja/source.txt", false);
          BufferedWriter bw  = new BufferedWriter(fw);
          for(String t : str)
          {
               bw.write(t);
               bw.newLine();//this is the method which is used to write the data into the new line 
          }
          bw.close();

     }




     public static void main(String[] args) throws Exception{
          Buffer_Reader_4 obj = new Buffer_Reader_4();
          obj.write_Data();
          obj.updataData();
          obj.printData();
     }
}
