public class String_immutability {
     
     public static void main(String[] args) {
          String s = "ravi";
          String s1 = s.concat("kumar");
          String s2 = s1.concat("hello");

          System.out.println(s +"\n" + s1 +"\n" + s2);
          System.out.println("\n");
          StringBuilder sb1 = new StringBuilder("ravi");
          StringBuilder sb2 = sb1.append("kumar");
          StringBuilder sb3 = sb2.append("hello");

          System.out.println(sb1 +"\n" + sb2 +"\n" + sb3);

          if(sb1.equals(sb2)&&sb2.equals(sb3)) 
          {
               System.out.println("BOTH STRING BUILDERS ARE POINTED TO SAME OBJ");
          }

          // STRINGS ARE IMMUTABLE WHERE AS THE STRING BUILDERS ARE MUTABLE

          //IF WE DONNOT PERFORM THE  modification on the concatination of the string then 
          //string objs are pointed to same object ref

          String str1 = new String("ravi");
          String str2 = str1.concat("");//not modifing the data so new obj is not created here
          String str3 = str2.concat("");
          if(str1.equals(str2) && str2.equals(str3))
          {
               System.out.println("STRING  OBJECTS POINTING TO THE SAME OBJECT");
          }
         //equals() method is used to check the data of the two strings are equal or not
          // == operator is used to check the two strings ref_value is same or not


          
     }
}
