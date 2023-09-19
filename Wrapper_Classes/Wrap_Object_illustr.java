
public class Wrap_Object_illustr {
 
     public static void main(String[] args) {
          //when ever the new object created then ref values are varies even in this wrapper classes
          Integer i_1 = new Integer(1);
          Integer i_2 = new Integer(2);
          System.out.println( i_1 == i_2);

          Float f_1 = new Float(1.1);
          Float f_2 = new Float(1.1);
          System.out.println(f_1 == f_2);


         //in the context of auto boxing by the time of the loading of the wrapper
         // classes it generates the objects from the -128 to +127 values related objects
         //if any object requires this value the jvm does not create the
         //extenal object already existed obj ref will we assigned

         Integer temp_1 =  1;//1 is in the range (-128 , 127)
         Integer temp_2 = 1;
         if(temp_1 == temp_2)
         {
              System.out.println("objects are pointing to the same ref_value");
         }

         Integer it_1 =  190;//out of range so new object is created
         Integer it_2 =  4;//in the range no need of creating the new object

         if(it_1 == it_2)
         {
              System.out.println("objects are same");
         }
         else
         {
              System.out.println("objects ARE NOT SAME");
         }


         //for boolean types automatically two objects they are true and false are created

         //for floating types and the double types there is no defalut objects are created
         //because  of the various precisions are the even in between 0 to 1 we can represent 100 of precision 
         //so it is not possible
         Float f = 1.1f;
         Float f_4 = 1.1f;
         if(f == f_1)
         {
          System.out.println("objects are same");
          }
          else
          {
          System.out.println("objects ARE NOT SAME");
          }


          Character ch = Character.valueOf('A');
          int t = ch.charValue();
          System.out.println(t + " "+(f + f_1));

     }
}
