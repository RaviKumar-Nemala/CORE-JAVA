


public class part_1 {
     public static void main(String[] args) {
          
          String str1 = "ravi";
          String str2 ="ravi";
/*in this context strings are created in the 
string constant pool area when the strings are stored in the
string constant pool area then it does not create the second obj 
for the same data
          instead of that it will simply assing already existed
object refernce to the ref_var;
*/

          if(str1 == str2 )
          {
               System.out.println("BOTH OBJS ARE POINTING TO THE SAME  REFERNCE VALUE");
          }


          String s1 = new String("ravi");
          String s2 = new String("ravi");
/* in this context strings are stored in the heap memory becaz of the
new keyword irrespective of the object of same data will existed or not
it will create the new object*/
          if(s1 == s2)
          System.out.println("OBJ ARE POINTING THE SAME REF_VALUE");
          else
          {
               System.out.println("DIFFERENT REF_VALUES");
          }

// toString() method is used to return the obj reference value if the 
//Object class toString method is not overridden on the existed class
//in the context of the string if we use sysout and try to print  the
//string ref_var then it will defaulty call string class overridden 
//toString() value and it return data of the existed string object
          System.out.println(s1.toString());


          String s3 = new String();//defalut constructor 
          System.out.println(s3); //space 
     }
}
