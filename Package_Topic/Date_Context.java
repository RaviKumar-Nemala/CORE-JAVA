import java.sql.*;
import java.util.*;

/*date class is defined on the both packages so inorder to specify the 
*compiler which package date class that we are using we need to provide the
fully qualified name
*/
public class Date_Context {
     
     public static void main(String[] args) {
          java.util.Date d = new java.util.Date();//if we are doing like this not required to 
          //import the packages
          
          System.out.println(d);

          //Date d1  =  new Date.valueOf("2022-04-11");
          //System.out.println(d1);


          java.sql.Date date = java.sql.Date.valueOf("2022-04-11"); //new operator is not required wrapper class context
          System.out.println(date);

     }
}
