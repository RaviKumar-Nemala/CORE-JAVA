public class stb_1 {
 public static void main(String[] args) {
      //ALL STRING BUFFER METHODS ARE AVAILABLE AT STRING BUffer is applicable for the string builders
     StringBuilder sb = new StringBuilder();
     //default capacity in the sence stroing elemens capability is 16
     //STRING BUILDER IS THE NON SYNCHRONIZED TYPE
     // IT ALLOWS MORE THEN ONE THREAD AT A TIME

     sb = new StringBuilder("abc");
     //now capability is 3+16=19
     sb =new StringBuilder(10);
     //now the capability is 10 ;
     System.out.println(sb.capacity());
     if(sb.contains("a"))
     {
          System.out.println("helo");
     }
 }    
}
