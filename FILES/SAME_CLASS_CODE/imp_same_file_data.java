import java.io.FileInputStream;

class Test {
     
     public static void main(String[] args) throws Exception{
          String file_name = args[0];//here we are taking the argument 
// as the file name and we are trying to print that file content
//if you specified this class file name as input through command line argument
//then it produces all the program .

//EXAMPLE: java  Test.java imp_same_file_data.java //like this Test is main class and class code is presented in the imp_same_file_data.java (.java) extension is manditory because of you have saved this file with the .java extension right

          FileInputStream fs = new FileInputStream(file_name );

          int fileSize = fs.available();//returns the size of the file in bytes
          byte b [] = new byte[fileSize];

          b = fs.readAllBytes();
          
          String s = new String(b);
          System.out.println(s);
     }
}
