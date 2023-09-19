import java.io.FileInputStream;
import java.io.FileReader;
public class same_class_code_2 {
     
     public static void main(String[] args) throws Exception{
     String filename =    args[0];
     
     String file_content = "";
     int dataValid ;

     dataValid = fr.read();
          while(dataValid!=-1)
          {
          file_content += (char)dataValid;
          dataValid  =  fr.read();
          }
          fr.close();
          System.console();
          System.out.println(file_content);
     }
}
