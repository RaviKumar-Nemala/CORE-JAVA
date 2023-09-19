package INTRODUCTION;
public class This_Keyword_Constructor_Illustration {

     This_Keyword_Constructor_Illustration()
     {
          this(1 ,  2); //IT WILL CALL THE constructor of the Integer parameter
          System.out.println("zero parameters");
          //this(1,2)//it will give an error calling constructor using this should be the first statement
          //IT IS ALSO NOT POSSIBLE TO REFER MORE THAN ONE THIS KEYWORD IN THE CONSTRUCTOR BECAUSE OF THE FIRST STATEMENT ONLY TAKES THE JVM AS THE CONSTRUCTOR IT CAN'T REFER THE SECOND STATEMENT AS THE CONSTRUCTOR CALL
     }

     public This_Keyword_Constructor_Illustration  get_Ref_Val()
     {
          This_Keyword_Constructor_Illustration ref = new This_Keyword_Constructor_Illustration();
          return ref;
     }

     public This_Keyword_Constructor_Illustration  get_Ref_Val_2()
     {
          return this;
     }


     This_Keyword_Constructor_Illustration(int i , int j )
     {
          System.out.println("two parameters");
     }
     void check()
     {
         // this(1,2) //it will give an error becuase we can't call the constructor with help of this inside the methods this is only possible to declare inside the constructor as the first statement in the constructor.
     }
     
     public static void main(String args[])
     {    
          This_Keyword_Constructor_Illustration obj = new This_Keyword_Constructor_Illustration();
          obj.check(); //used because of the warnings

          System.out.println("GETTING THE REFERENCE VALUES OF DIFFERNET TYPES");
          for(int i = 0 ;i <  3 ;i ++)
          System.out.print(obj.get_Ref_Val());

          System.out.println("GETTING THE REFERENCE VALUES OF THE SAME TYPE");

          for(  int j = 0 ; j<  3; j++)
          {
               System.out.println(obj.get_Ref_Val_2());
          }

          
     }
}
