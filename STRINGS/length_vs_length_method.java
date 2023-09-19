public class length_vs_length_method {
     
     public static void main(String[] args) {
          //length  is a VARIABLE USED TO RETURN THE LEGTH OF THE ARRAY
          //length() method is used for string objects to return the no of chars in the string 

          String s = new String("helllo");
          char ch[] = {'a' , 'b'};
          System.out.println(ch.length);
          System.out.println(s.length());

          //System.out.println(s.length);//error
          //System.out.println(ch.length());error
     }
}
