package INTRODUCTION;
class Father
{
     static
     {
          System.out.println("FATHER STATIC BLOCK");
     }
     static int f = temp_method();

     static int temp_method()
     {

          System.out.println("INSIDET THE FATHER CLASS STATIC METHDO");
          return 3;
     }
}

class For extends Father
{
     static 
     {
          System.out.println("STATIC BLOCK");
     }

     For()//CONSTRUCTOR  NOT EXECUTED ONLY STATIC BLOCK IS EXECUTED 
     {
          System.out.println("CONSTRUCTOR");
     }
     
     void check()
     {
          System.out.println("ehlladflaj");
     }
}

//THIS IS USED TO LOAD THE BYTE CODE INTO THE METHOD AREA WITHOUT CREATING THE OBJECT
public class For_Name_method {
     
     public static void main(String args[])throws Exception{
          Class obj = Class.forName("For");
          String s = obj.getName();//this method returns the class name whose byte code has loaded into the memory without creating the object
          System.out.println(s);
          System.out.println(obj.getSuperclass().getName());//used to return the class name of the super class by default java. lang.Object is the super class for all the classes
          //THIS IS USED TO LOAD THE BYTE CODE WITHOUT CREATING THE OBJECT
//NOTE: by the time jvm need to take the byte code of a particular class then it does two things 
//1) it will load the byte code into the method area 
//2) it will load the byte code into the java.lang.Class 

          Object u = obj.newInstance();
          System.out.println(u.toString());//with this u varaible we can't access the methods of the "for " class
          //new instance method is presented in the Class(java.lang .class) it is used to crete the object for the loaded byte code in this case class "for" byte code is already loaded but object is not created inorder to create the object for that class we used newInstance
          //this newInstance check weather the loaded byte code has the zero argument  constructor or not also the construct shouldnot be the private constructor 
          //if it is then only it will create the object other wise 
          //other wise it will raise exception instantiation incase of the arguemented constructor
          //illegal access exception in case of the private constructor
          
}
}