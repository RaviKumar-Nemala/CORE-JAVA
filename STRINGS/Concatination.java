public class Concatination {
     
     public static void main(String[] args) {
          String s = "hello".concat("kumar").concat("ddos ");
          System.out.println(s);

          String s1 = "hi "+"there";
          System.out.println(s1);

          String s2 = "ravi";
          String s3 = "kumar";
          String s4 =s2+s3;
          System.out.println(s4);


          s3 = s2.concat("hi");
          System.out.println(s3);
          System.out.println(s2);//no effect on the s2 becaz immutability
     }
}
