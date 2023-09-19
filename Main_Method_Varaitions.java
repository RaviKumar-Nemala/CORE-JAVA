// it is possible to declare the more then one main method 
// but these main methods should be on to the different classes
//if we use java with "M1" class name then M1 class main method executed
//if we use java with "Main_Method_Varaitions" class name then "Main_Method_Varaitions" class main method executed

class M1
{
     public static void main(String args[])
     {
          System.out.println("HELLO FROM M1");
         // Main_Method_Varaitions.main(args); //if both methods are calling each other then it becomes infinite loop
     }
}

 class Main_Method_Varaitions {
     
     public static void main(String args[])
     {
     System.out.println("HELLO FROM THE MAIN_METHOD_VARAITIONS CLASS");
     String arg[] = {"hi" , "hello"};
     M1.main(arg); //calling another main method 
     }
}
