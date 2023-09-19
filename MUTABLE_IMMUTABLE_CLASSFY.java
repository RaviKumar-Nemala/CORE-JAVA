package INTRODUCTION;
public class MUTABLE_IMMUTABLE_CLASSFY {
     
     public static void main(String args[])
     {
          String s1 = new String("hello ");
          String s2 = s1.concat("Ravi");//in this nature of the object whenever the concatination is performed then we need to assign the new object to get the modifable concatinated data 
          String s3 = s2.concat("KUMAR");

          System.out.println("IN THE IMMUTABLE OBJETS : ");

          System.out.println(" S1  = "   +s1);
          System.out.println("S2   = "    +s2);
          System.out.println("S3   =  "   +s3);

          System.out.println("IN THE MUTABLE OBJECTS : ");

          StringBuffer sb1 = new StringBuffer("hello ");
          StringBuffer sb2 = sb1.append("RAVI");// in  the original sb1 this appended data will be added and the same sb1 reference value will be assigned to this sb2 reference varaible
          StringBuffer sb3 = sb2.append("KUMAR");//here is also kumar will be added to the original "hello Ravi" and resultant data will be stored on the same object and that object reference value will be holded by this sb3
          //sb1 and sb2  sb3 are pointed to the same object this is because of the modification of concation is done on the same object because no need of creating the new object 

          System.out.println(" S1  = "   +sb1);
          System.out.println("S2   = "    +sb2);
          System.out.println("S3   =  "   +sb3);          
     }
}
