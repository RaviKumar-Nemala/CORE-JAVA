

class A
{
     void access()
     {
          System.out.println("ACCESS METHOD");
     }
     static int  i ;

     A(int i)
     {

     }
     
}

class Child extends A
{
     
}

class Test
{
     private Test()
     {

     }
}
public class Normal_Excp_Types {
     
     public static void main(String[] args) throws Exception {
          //ARTHEMATIC EXCEPTION

        /**    int a = 10;
               int b = 0;
           System.out.println(a/b);
          */  


          //NULL POINTER EXCEPTION only applicable for instance context

          /**   
           * 
           *  A obj = null;
          obj.access(); //null pointer exception with the help of null pointer cannot invoke the instance methods
          //it is possible to accesss the static methods and the variables withe the null pointer 
          System.out.println(obj.i);
          */
         
          



      //ARRAY INDEX OUT BOUND EXCEPTION

          var arr = new int [10];
          int a[] = new int [10];//default allocation is 0;
          int j = 10;
          //static int k = 11;//error cannot declare the static variables in the main method 

         // System.out.println(arr[11] +" "+a[11]);


     //String index out of boudn exceptionHandling

     String s = new String("hello");
  //   System.out.println(s.charAt(10));


     //class cast exception
     
     //it is not possible to assign the parent class ref_value to 
     //the child class ref_variable

     //Child ch = new A();//class cast exception

     /*
     Class cls = Class.forName("AB");//if the class existed then jvm will load the byte code to the memory
     //if class not existed it provides class not found exception
     Object obj = cls.newInstance();
     */



     //INSTANTIATION EXCEPTION

   //  Class cls1 = Class.forName("A");
     //Object obj1 = cls1.newInstance();//instantion exception occurred
     //if the specified class does not have the 0 arg constructor
     //if the specified class does not have any constructor then 
     //compiler will create the default constructor
     //if the class only have the parameteraized constructo then 
     //newInstance try to invoke the 0args constructor which is not provided so it raise the class not found exception

     //A obj = (A)obj1;          
     //obj.access();


     //illegal Access modifier exception

     //if we specify the constructor as private  while invoking the 
     //newInstance() method then it is called illegal access modifier exceptionHandling

     
     Class cl = Class.forName("Test");
     Object ob = cl.newInstance();//there is no public or defalut  constructor then it returns the illegal access exception
     


     //file not found exception
     //if we want to read or write the data into the certain file 
     //if it does not exists then it returns the fie not found exceptionHandling

     }
}
