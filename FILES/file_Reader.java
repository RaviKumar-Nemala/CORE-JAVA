import java.io.FileReader;
public class file_Reader {
     
     public static void main(String[] args)throws Exception {
          //USED TO RETRIVE THE DATA FROM THE FILE 
          // if the file not exist then it will raise exception
          FileReader fr = new FileReader("D:/CORE_JAVA_UDEMY/INTRODUCTION/FILES/my_file.txt");
          String s = "";

          int temp  = fr.read(); //file reader provides the data in the form of the ascii values (int ) then we need to convert those into the form of the string;
          while(temp!= -1)
          {
               s = s + (char)temp;
               temp  = fr.read();
          }
          System.out.println(s);
          fr.close();
     }    
}
