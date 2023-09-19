import java.io.*;

public class Buffered_Reader_2 {
     
     public static void main(String[] args) {
          //float sal ; even if we declare the float here no problem
          try(BufferedReader  br = new BufferedReader(new InputStreamReader(System.in))){
          float sal;
          String name ;
          System.out.println("ENTER THE NAME :");
          String temp = "";
          temp =  br.readLine();
          name = temp;
          System.out.println("ENTER THE SALARY");
          temp = br.readLine();
          sal = Float.parseFloat(temp);//need to conver it 
          System.out.println(sal  + " "+name);
     }
     catch(Exception e)
     {
          e.printStackTrace();
     }
}
}