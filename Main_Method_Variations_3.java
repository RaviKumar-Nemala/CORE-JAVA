class A
{
     public static void main(String args[])
     {
          System.out.println("INSIDE OF THE SUPER CLASS");
     }
}
class B extends A
{
          public static void main(String args[]) //string args used take the command line arguments we can give used define name to this string like String[]a , String []b etc;
          {
               System.out.println("child ");//initially jvm will check main method is presented in this class or not by the time if we provide class name for execting the application
                    //if main presented it does not invoke thesuper class main if not presented then it will invoke the super class main method
               String a []= { " d " ,  " da"};
               A.main(a);//due to the inheritane we are calling the main method (it is static so class name is enough no need to create the object)
          }

          /*    public static void main(String ...args)
          {
               //VALID SYNTAX 
          }*/

          /*public static void main(String args[])
          {
               //VALID SYNTAX 
          }*/
          /*public static final void main(String args[])
          {
               it is possible to use the final and static in the main method but duplication is there so compilation if this method only presented inside this class then it works fine
          }*/

          /*private static void main(String args[])
          {
               compiles fine but runtime exceptin not found main method
          }*/
}

